package com.volkruss.wannaishop.application.controller.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.volkruss.wannaishop.domain.model.DetailItem;
import com.volkruss.wannaishop.domain.model.Item;
import com.volkruss.wannaishop.domain.model.Stock;
import com.volkruss.wannaishop.domain.service.ItemService;
import com.volkruss.wannaishop.domain.service.StockService;

@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemService; 
	
	@Autowired
	private StockService stockService;

	/**
	 * 
	 * <P>
	 * 商品モデルのリストを取得します。
	 * </P>
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("public/items")
	public List<Item> InitItemPage(Model model) {
		// item一覧を取得してViewを返却します。
		return itemService.getItems();
	}
	
	/**
	 * 
	 * <P>
	 * 商品詳細モデルを取得します。
	 * </P>
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("public/item/{id}")
	public DetailItem InitDetailItemPage(@PathVariable("id") Integer id) {
	
		// TODO serviceが分割されているので、一つにしてロジッククラスに処理を委譲する
		DetailItem detailItem = itemService.getDetailItemById(id);
		Stock stock = stockService.getStockById(Integer.valueOf(id).intValue());
		
		detailItem.setStock(stock.getCount());
		
		return detailItem;
	}
	
}
