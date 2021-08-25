package com.volkruss.wannaishop.domain.settings.auth;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.volkruss.wannaishop.application.request.LoginForm;

public class MisakaAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    private AuthenticationManager authenticationManager;

    public MisakaAuthenticationFilter(AuthenticationManager authenticationManager, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.authenticationManager = authenticationManager;

        // ログイン用のpathを変更する
        setRequiresAuthenticationRequestMatcher(new AntPathRequestMatcher("/api/login", "POST"));

        // ログイン用のID/PWのパラメータ名を変更する
        setUsernameParameter("username");
        setPasswordParameter("password");

        // ログイン後にリダイレクトのリダイレクトを抑制
        this.setAuthenticationSuccessHandler((req, res, auth) -> res.setStatus(HttpServletResponse.SC_OK));
        // ログイン失敗時のリダイレクト抑制
        this.setAuthenticationFailureHandler((req, res, ex) -> res.setStatus(HttpServletResponse.SC_UNAUTHORIZED));
    }

    // 認証の処理
    @Override
    public Authentication attemptAuthentication(HttpServletRequest req,
                                                HttpServletResponse res) throws AuthenticationException {
        try {
            // requestパラメータからユーザ情報を読み取る
        	LoginForm userForm = new ObjectMapper().readValue(req.getInputStream(), LoginForm.class);
            return authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            userForm.getUsername(),
                            userForm.getPassword(),
                            new ArrayList<>())
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
