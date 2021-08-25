package com.volkruss.wannaishop.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.volkruss.wannaishop.domain.entity.OrderEntity;

public interface OrderJpaRepository  extends JpaRepository<OrderEntity,Integer>{

}
