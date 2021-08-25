package com.volkruss.wannaishop.infrastructure.repository;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.volkruss.wannaishop.domain.entity.StockEntity;
import com.volkruss.wannaishop.domain.model.Stock;
import com.volkruss.wannaishop.domain.repository.StockRepository;

@Repository
public class StockRepositoryImpl implements StockRepository{
	
	@Autowired
	private StockJpaRepository stockJpaRepository;

	@Override
	public Stock getStockById(int id) {
		// TODO 取得の仕方を修正する
		Optional<StockEntity> opt = stockJpaRepository.findAll().stream().filter(u -> u.getItem_id()==id).findFirst();
		if(!opt.isPresent()) {
			
		}
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(opt.get(), Stock.class);
	}

	@Override
	public void save(List<StockEntity> stocks) {
		stockJpaRepository.saveAll(stocks);
	}
	
	

}





