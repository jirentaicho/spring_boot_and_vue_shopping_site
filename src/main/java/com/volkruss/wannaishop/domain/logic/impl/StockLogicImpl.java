package com.volkruss.wannaishop.domain.logic.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.volkruss.wannaishop.domain.logic.StockLogic;
import com.volkruss.wannaishop.domain.logic.StockPersistenceLogic;
import com.volkruss.wannaishop.domain.model.Stock;

@Component
public class StockLogicImpl implements StockLogic{
	
	@Autowired
	private StockPersistenceLogic stockPersistenceLogic;

	@Override
	public void register(Map<Integer, Stock> map) {
		
		List<Stock> list = new ArrayList<>(map.values());
		
		// TODO バリデーションチェックを行う
		// stockValidationLogix.execute(list);
		
		stockPersistenceLogic.save(list);
	}

}
