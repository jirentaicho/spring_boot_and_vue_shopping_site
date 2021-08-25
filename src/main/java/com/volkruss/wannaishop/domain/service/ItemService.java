package com.volkruss.wannaishop.domain.service;

import java.util.List;

import com.volkruss.wannaishop.domain.model.DetailItem;
import com.volkruss.wannaishop.domain.model.Item;

public interface ItemService {
	List<Item> getItems();
	
	DetailItem getDetailItemById(int id);
}
