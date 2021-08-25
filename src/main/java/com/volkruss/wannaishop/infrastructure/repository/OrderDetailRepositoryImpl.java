package com.volkruss.wannaishop.infrastructure.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.volkruss.wannaishop.domain.entity.OrderDetailEntity;
import com.volkruss.wannaishop.domain.repository.OrderDetailRepository;
@Repository
public class OrderDetailRepositoryImpl implements OrderDetailRepository{
	
	@Autowired
	private OrderDetailJpaRepository orderDetailJpaRepository;
	
	@Override
	public void save(OrderDetailEntity orderDetail) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveAll(List<OrderDetailEntity> list) {
		orderDetailJpaRepository.saveAll(list);
		
	}

}
