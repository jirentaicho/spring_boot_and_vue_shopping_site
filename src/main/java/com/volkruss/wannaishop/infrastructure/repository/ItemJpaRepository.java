package com.volkruss.wannaishop.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.volkruss.wannaishop.domain.entity.ItemEntity;

public interface ItemJpaRepository extends JpaRepository<ItemEntity,Integer>{

}
