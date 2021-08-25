package com.volkruss.wannaishop.domain.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import lombok.Getter;
import lombok.Setter;

@Component
@Setter
@Getter
@SessionScope
public class Cart {
	
	/**	カート */
	private List<OrderDetail> cart = new ArrayList<>();
	
	public void addItem(OrderDetail orderDetail) {
		// 削除処理追加時に不具合出る。注文時に付与するほうが良い
		orderDetail.setDetailNo(cart.size() + 1);
		this.cart.add(orderDetail);
	}
	
	public void removeItem(Item item) {
		//TODO Itemに紐づくCartを削除する
	}
	
	public void clearCart() {
		this.cart.clear();
	}
	
	
	/**
	 * カート内の商品合計金額を返す
	 * 
	 * @return カート内の合計金額
	 * 
	 */
	public int getTotalAmt() {
		return cart.stream().reduce(
				0,
				(ac,order) -> ac + (order.getAmt() * order.getCount()),
				(ac1,ac2) -> ac1 + ac2);
	}
	
}
