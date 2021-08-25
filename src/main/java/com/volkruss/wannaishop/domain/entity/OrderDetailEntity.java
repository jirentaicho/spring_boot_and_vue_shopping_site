package com.volkruss.wannaishop.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "m_order_detail")
public class OrderDetailEntity {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	@Column(name = "detail_no ")
	private int detail_no ;
	
	@Column(name = "order_id")
	private int order_id;
	
	@Column(name = "item_id")
	private int item_id;
	
	@Column(name = "item_name")
	private String item_name;
	
	@Column(name = "count")
	private int count;
	
	@Column(name = "price")
	private int price;
	
}
