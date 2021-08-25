package com.volkruss.wannaishop.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DetailItem {

	private String name;
	
	private int price;
	
	private String thumbnail;
	
	private String note;
	
	private int stock;
	
}
