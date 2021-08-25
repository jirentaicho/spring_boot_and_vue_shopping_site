package com.volkruss.wannaishop.domain.logic.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.volkruss.wannaishop.domain.entity.OrderDetailEntity;
import com.volkruss.wannaishop.domain.entity.OrderEntity;
import com.volkruss.wannaishop.domain.logic.NumberingLogic;
import com.volkruss.wannaishop.domain.logic.OrderPersistenceLogic;
import com.volkruss.wannaishop.domain.model.Order;
import com.volkruss.wannaishop.domain.repository.OrderDetailRepository;
import com.volkruss.wannaishop.domain.repository.OrderRepository;

@Component
public class OrderPersistenceLogicImpl implements OrderPersistenceLogic{

	@Autowired
	private NumberingLogic numberingLogic;
	
	@Autowired
	private OrderRepository orderRepository;
		
	@Autowired
	private OrderDetailRepository orderDetailRepository;
	
	@Override
	public void save(Order order) {
		// TODO 粒度を揃える
		int orderId = numberingLogic.getOrderId();
		order.setId(orderId);
		
		// TODO toMapperLogic		
		ModelMapper mapper = new ModelMapper();
		OrderEntity entity = mapper.map(order, OrderEntity.class);
		// TODO ユーザー名の設定を行う。名称の規則性を統一する（マッピングできてない）
		entity.setPrice_amt(order.getPriceAmt());
		entity.setUser_name("misaka");
		
		List<OrderDetailEntity> detailList = order.getDetail().stream().map(detail -> {
			OrderDetailEntity detailEntity = mapper.map(detail, OrderDetailEntity.class);
			// TODO 処理の分離
			detailEntity.setOrder_id(orderId);
			// TODO 名称の規則性を統一する（マッピングできてない）
			detailEntity.setItem_id(detail.getItemId());
			detailEntity.setItem_name(detail.getItemName());
			detailEntity.setDetail_no(detail.getDetailNo());
			detailEntity.setPrice(detail.getAmt());
			return detailEntity;
		}).collect(Collectors.toList());
		
		orderRepository.save(entity);
		
		orderDetailRepository.saveAll(detailList);
		
	}

}
