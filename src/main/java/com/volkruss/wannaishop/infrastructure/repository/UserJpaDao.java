package com.volkruss.wannaishop.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.volkruss.wannaishop.domain.entity.UserEntity;

public interface UserJpaDao  extends JpaRepository<UserEntity,String>{

}
