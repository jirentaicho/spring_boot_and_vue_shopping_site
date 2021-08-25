package com.volkruss.wannaishop.domain.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.volkruss.wannaishop.domain.model.DetailItem;
import com.volkruss.wannaishop.domain.model.Item;
import com.volkruss.wannaishop.domain.repository.ItemRepository;
import com.volkruss.wannaishop.domain.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{
	
	@Autowired
	private ItemRepository itemRepository;

	@Override
	public List<Item> getItems() {
		return itemRepository.getAll();
	}

	@Override
	public DetailItem getDetailItemById(int id) {
		return itemRepository.getDetailById(id);
	}
	

}
