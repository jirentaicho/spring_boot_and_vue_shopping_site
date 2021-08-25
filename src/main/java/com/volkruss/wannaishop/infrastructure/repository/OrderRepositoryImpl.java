package com.volkruss.wannaishop.infrastructure.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.volkruss.wannaishop.domain.entity.OrderEntity;
import com.volkruss.wannaishop.domain.repository.OrderRepository;
@Repository
public class OrderRepositoryImpl implements OrderRepository {

	@Autowired
	private OrderJpaRepository orderJpaRepository;
	
	@Override
	public void save(OrderEntity order) {
		orderJpaRepository.save(order);
		
	}

}
