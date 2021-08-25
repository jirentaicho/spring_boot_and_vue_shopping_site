package com.volkruss.wannaishop.application.controller;

import java.util.Objects;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.volkruss.wannaishop.domain.model.Cart;
import com.volkruss.wannaishop.domain.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private HttpSession httpSession;
	
	@Autowired
	private OrderService orderService;
	
	// TODO 処理をカートコントローラーに移動する。
	@PostMapping("api/checkout")
	public void CheckoutOrder() {
		//TODO ロジックの委譲
		Cart cart = (Cart)httpSession.getAttribute("cart");
		if(Objects.isNull(cart)) {
			//TODO エラー処理
			return;
		}
		orderService.register(cart);
		
	}
	
}
