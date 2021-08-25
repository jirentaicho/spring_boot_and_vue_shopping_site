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
@Table(name = "m_number")
public class Number {
	@Id
	@Column(name = "id")
	private int order_id;
}
