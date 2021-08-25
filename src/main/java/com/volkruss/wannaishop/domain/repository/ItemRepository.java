package com.volkruss.wannaishop.domain.repository;

import java.util.List;

import com.volkruss.wannaishop.domain.model.DetailItem;
import com.volkruss.wannaishop.domain.model.Item;


public interface ItemRepository {
	
	/**
	 * アイテムマスタに存在する全てのアイテムを返却します。
	 * 
	 * @return
	 */
	List<Item> getAll();
	
	/**
	 * {@link Item}のIDから{@link DetailItem}を返却します。
	 * 
	 * @param id
	 * @return
	 */
	DetailItem getDetailById(int id);
}
