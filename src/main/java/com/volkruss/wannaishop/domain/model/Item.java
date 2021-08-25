package com.volkruss.wannaishop.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {

	private int id;

	private String name;
	
	private int price;
	
	private String thumbnail;
	
	private String note;
}
