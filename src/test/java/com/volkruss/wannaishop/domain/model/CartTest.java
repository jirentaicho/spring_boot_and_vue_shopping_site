package com.volkruss.wannaishop.domain.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class CartTest {

	@Test
	void test_正しく合計金額が取得できる() {

		// 300円
		OrderDetail detail1 = createOrderDetail();

		detail1.setAmt(100);
		detail1.setCount(3);
		
		// 100円
		OrderDetail detail2 = createOrderDetail();
		detail2.setAmt(100);
		detail2.setCount(1);
		
		// 600円
		OrderDetail detail3 = createOrderDetail();
		detail3.setAmt(300);
		detail3.setCount(2);
		
		List<OrderDetail> list = new ArrayList<>();
		list.add(detail1);
		list.add(detail2);
		list.add(detail3);
		
		Cart cart = new Cart();
		cart.setCart(list);
		
		assertEquals(1000, cart.getTotalAmt());
	}
	
	private OrderDetail createOrderDetail() {
		OrderDetail detail = new OrderDetail();
		detail.setItemId(0);
		detail.setItemName("テストアイテム");
		detail.setUsername("テスター");
		detail.setAmt(0);
		detail.setCount(0);
		return detail;
	}

}
