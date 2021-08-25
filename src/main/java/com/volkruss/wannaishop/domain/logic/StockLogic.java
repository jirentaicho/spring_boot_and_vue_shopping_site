package com.volkruss.wannaishop.domain.logic;

import java.util.Map;

import com.volkruss.wannaishop.domain.model.Stock;


public interface StockLogic {
	public void register(Map<Integer, Stock> map);
}
