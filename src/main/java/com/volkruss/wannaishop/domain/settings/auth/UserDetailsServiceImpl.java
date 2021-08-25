package com.volkruss.wannaishop.domain.settings.auth;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.volkruss.wannaishop.domain.entity.UserEntity;
import com.volkruss.wannaishop.infrastructure.repository.UserDao;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		// まずはm_userテーブルからレコードを取得する
		UserEntity userEntity = userDao.findByName(username).orElseThrow(() -> new UsernameNotFoundException("not found"));
		
		//　権限の設定
		// TODO データベースから権限を取得する。
		Collection<GrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority("USER"));
		
		// Userに変換して返却
		return new User(userEntity.getName(),new BCryptPasswordEncoder().encode(userEntity.getPassword()),authorities);
	}

}
