package com.volkruss.wannaishop.domain.settings.auth;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@Configuration
public class AuthSetting extends WebSecurityConfigurerAdapter{

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
      // TODO 不要と確信できたらコメントを除去
//    //UserDetailsServiceImplの設定はそっちでやっているので不要のように感じる
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//    	// 不要？
//    	auth.userDetailsService(userDetailsServiceImpl)
//    	.passwordEncoder(passwordEncoder);
//    }
	
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/css/**", "/img/**", "/js/**");
	}
	
	//　参考：https://github.com/sun-bs/bs-heroku-spring-boot-vue-sample
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.logout().logoutUrl("/api/logout")
        .deleteCookies("JSESSIONID")
        .invalidateHttpSession(true)
        .logoutSuccessHandler((req, res, auth) -> res.setStatus(HttpServletResponse.SC_OK));

		http.authorizeRequests()
        .antMatchers("/").permitAll()
        .antMatchers("/api/login").permitAll()
        .antMatchers("/public/**").permitAll()
        .antMatchers("/api/**").authenticated()
        .and()
        .sessionManagement()
        ;

        http.exceptionHandling().authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED));
 
        http.addFilter(new MisakaAuthenticationFilter(authenticationManager(), bCryptPasswordEncoder()));
        http.csrf().ignoringAntMatchers("/api/login").csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());

	}

}
