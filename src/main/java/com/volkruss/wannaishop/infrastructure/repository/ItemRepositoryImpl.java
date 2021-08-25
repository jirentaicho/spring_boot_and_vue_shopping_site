package com.volkruss.wannaishop.infrastructure.repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.volkruss.wannaishop.domain.entity.ItemEntity;
import com.volkruss.wannaishop.domain.model.DetailItem;
import com.volkruss.wannaishop.domain.model.Item;
import com.volkruss.wannaishop.domain.repository.ItemRepository;

@Repository
public class ItemRepositoryImpl implements ItemRepository{

	@Autowired
	private ItemJpaRepository itemJpaRepository;
	
	@Override
	public List<Item> getAll() {
		List<ItemEntity> lists = itemJpaRepository.findAll();
		ModelMapper modelMapper = new ModelMapper();
		return lists.stream().map(entity -> modelMapper.map(entity, Item.class)).collect(Collectors.toList());
	}

	@Override
	public DetailItem getDetailById(int id) {
		Optional<ItemEntity> opt = itemJpaRepository.findById(id);
		if(!opt.isPresent()) {
			// TODO エラーの追加
		}
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(opt.get(), DetailItem.class);
	}

}
