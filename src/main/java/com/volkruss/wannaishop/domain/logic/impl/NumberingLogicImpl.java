package com.volkruss.wannaishop.domain.logic.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.volkruss.wannaishop.domain.logic.NumberingLogic;

@Component
public class NumberingLogicImpl implements NumberingLogic{

	@Autowired
	protected JdbcTemplate jdbcTemplate;
	
	@Override
	@Transactional
	public int getOrderId() {
		String query = "UPDATE m_number SET order_id = order_id + 1;";
		jdbcTemplate.update(query);
		
		query = "SELECT order_id from m_number;";
		int result = jdbcTemplate.queryForObject(query, Integer.class);
		
		return result;
	}

}
