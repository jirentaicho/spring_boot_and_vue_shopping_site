package com.volkruss.wannaishop.application.controller;

import java.util.List;
import java.util.Objects;

import javax.servlet.http.HttpSession;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.volkruss.wannaishop.application.request.OrderRequest;
import com.volkruss.wannaishop.domain.model.Cart;
import com.volkruss.wannaishop.domain.model.OrderDetail;

@RestController
public class CartController {
	
	@Autowired
	private HttpSession httpSession;
	
	@GetMapping("/api/getcart")
	public List<OrderDetail> getCart() {
		Cart cart = (Cart)httpSession.getAttribute("cart");
		if(Objects.isNull(cart)) {
			return List.of();
		}
		return cart.getCart();
	}
	
	@PostMapping("api/addCart")
	public void AddCart(@RequestBody OrderRequest request) {
		
		// TODO ロジックの委譲
		Cart cart = (Cart)httpSession.getAttribute("cart");
		if(Objects.isNull(cart)) {
			cart = new Cart();
		}
		
		ModelMapper modelMapper = new ModelMapper();
		OrderDetail orderDetial = modelMapper.map(request, OrderDetail.class);
		
		cart.addItem(orderDetial);

		httpSession.setAttribute("cart", cart);	
	}
}
