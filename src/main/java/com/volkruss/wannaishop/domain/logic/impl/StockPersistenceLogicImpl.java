package com.volkruss.wannaishop.domain.logic.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.volkruss.wannaishop.domain.entity.StockEntity;
import com.volkruss.wannaishop.domain.logic.StockPersistenceLogic;
import com.volkruss.wannaishop.domain.model.Stock;
import com.volkruss.wannaishop.domain.repository.StockRepository;

@Component
public class StockPersistenceLogicImpl implements StockPersistenceLogic{

	@Autowired
	private StockRepository stockRepository;
	
	@Override
	public void save(List<Stock> stocks){
		
		ModelMapper modelMapper = new ModelMapper();
		List<StockEntity> entities =stocks.stream().map(stock -> modelMapper.map(stock, StockEntity.class)).collect(Collectors.toList());
		
		stockRepository.save(entities);
	}

}
