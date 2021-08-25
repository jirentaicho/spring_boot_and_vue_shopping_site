package com.volkruss.wannaishop.domain.logic;

import java.util.List;

import com.volkruss.wannaishop.domain.model.Stock;

public interface StockPersistenceLogic {
	public void save(List<Stock> stocks);
}
