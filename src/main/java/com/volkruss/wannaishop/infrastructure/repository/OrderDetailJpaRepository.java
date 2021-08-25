package com.volkruss.wannaishop.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.volkruss.wannaishop.domain.entity.OrderDetailEntity;

public interface OrderDetailJpaRepository  extends JpaRepository<OrderDetailEntity,Integer>{

}
