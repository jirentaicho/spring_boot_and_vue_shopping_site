package com.volkruss.wannaishop.domain.model;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * 注文の詳細（それぞれの注文内容）に関するモデル
 * 
 * @author wannai kinuho
 *
 */

@Setter
@Getter
public class OrderDetail {
	
	private String username;
	
	private int itemId;
	
	private int detailNo;
	
	private String itemName;
	
	private int count;
	
	private int amt;
	
}
