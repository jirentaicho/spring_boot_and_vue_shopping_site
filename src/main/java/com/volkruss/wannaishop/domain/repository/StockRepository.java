package com.volkruss.wannaishop.domain.repository;

import java.util.List;

import com.volkruss.wannaishop.domain.entity.StockEntity;
import com.volkruss.wannaishop.domain.model.Stock;

public interface StockRepository {
	Stock getStockById(int id);
	
	void save(List<StockEntity> stocks);
}
