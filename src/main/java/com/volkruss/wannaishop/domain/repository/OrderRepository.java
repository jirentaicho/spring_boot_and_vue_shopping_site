package com.volkruss.wannaishop.domain.repository;

import com.volkruss.wannaishop.domain.entity.OrderEntity;

public interface OrderRepository {
	void save(OrderEntity order);
}
