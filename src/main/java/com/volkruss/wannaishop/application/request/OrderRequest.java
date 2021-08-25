package com.volkruss.wannaishop.application.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrderRequest {
	
	private String username;
	
	private String itemName;
	
	private int itemId;
	
	private int count;
	
	private int amt;
	
}
