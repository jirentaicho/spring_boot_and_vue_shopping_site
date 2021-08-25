package com.volkruss.wannaishop.domain.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Order {
	
	private int id;
	
	private String userName;
	
	private int priceAmt;
	
	private List<OrderDetail> detail = new ArrayList<>();
}
