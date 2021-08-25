package com.volkruss.wannaishop.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "m_order")
public class OrderEntity {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "user_name")
	private String user_name;
	
	@Column(name = "price_amt")
	private int price_amt;
	
}
