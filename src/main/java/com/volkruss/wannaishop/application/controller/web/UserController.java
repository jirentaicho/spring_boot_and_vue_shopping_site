package com.volkruss.wannaishop.application.controller.web;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * ユーザーのログイン状態を管理しています。
 * 
 * @author wannai kinuho
 *
 */
@RestController
public class UserController {
	
	/**
	 * クライアントがログインしているかどうかだけ返す
	 * 
	 * @return ログインしている場合true ログインしていない場合false
	 */
	@GetMapping("/public/getisLogin")
	public boolean getUserState() {
		// TODO この辺修正
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		if(username.equals("anonymousUser")) {
			return false;
		}
		return true;
	}
		
}
