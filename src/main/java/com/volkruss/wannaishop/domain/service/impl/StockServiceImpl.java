package com.volkruss.wannaishop.domain.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.volkruss.wannaishop.domain.model.Stock;
import com.volkruss.wannaishop.domain.repository.StockRepository;
import com.volkruss.wannaishop.domain.service.StockService;

@Service
public class StockServiceImpl implements StockService{

	@Autowired
	private StockRepository stockRepository;
	
	@Override
	public Stock getStockById(int id) {
		return stockRepository.getStockById(id);
	}

}
