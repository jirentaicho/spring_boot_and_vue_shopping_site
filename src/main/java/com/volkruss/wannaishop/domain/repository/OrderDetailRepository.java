package com.volkruss.wannaishop.domain.repository;

import java.util.List;

import com.volkruss.wannaishop.domain.entity.OrderDetailEntity;

public interface OrderDetailRepository {
	
	/**
	 * 
	 * 注文詳細を一件登録する
	 * 
	 * @param orderDetail 注文詳細
	 */
	void save(OrderDetailEntity orderDetail);
	
	/**
	 * 注文詳細リストを登録する
	 * 
	 * @param list
	 */
	void saveAll(List<OrderDetailEntity> list);
}
