package com.volkruss.wannaishop.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.volkruss.wannaishop.domain.entity.StockEntity;

public interface StockJpaRepository  extends JpaRepository<StockEntity,Integer>{

}
