package com.volkruss.wannaishop.domain.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.volkruss.wannaishop.domain.logic.OrderPersistenceLogic;
import com.volkruss.wannaishop.domain.logic.StockLogic;
import com.volkruss.wannaishop.domain.model.Cart;
import com.volkruss.wannaishop.domain.model.Order;
import com.volkruss.wannaishop.domain.model.OrderDetail;
import com.volkruss.wannaishop.domain.model.Stock;
import com.volkruss.wannaishop.domain.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderPersistenceLogic orderPersistenceLogic;
	
	@Autowired
	private StockLogic stockLogic;
	
	@Override
	public void register(Cart cart) {

		// TODO 妥当性検証ロジックの呼出し
		// validationlogic.execute(cart);

		Order order = new Order();
		order.setPriceAmt(cart.getTotalAmt());
		// TODO 取得についてcartに実装を持たせる
		order.setUserName("misaka");
		
		// TODO toMapperLogic
		List<OrderDetail> details = new ArrayList<>();
		cart.getCart().stream().forEach( item -> {
			OrderDetail detail = new OrderDetail();
			detail.setItemId(item.getItemId());
			detail.setDetailNo(item.getDetailNo());
			detail.setItemName(item.getItemName());
			detail.setUsername(item.getUsername());
			detail.setAmt(item.getAmt());
			detail.setCount(item.getCount());
			
			details.add(detail);
		});
		
		order.setDetail(details);
		
		// TODO トランザクションをかける
		// マージして一つにまとめる
		Map<Integer, Stock> detailMap = new HashMap<>();
		
		order.getDetail().stream().forEach(detail -> {
			if(detailMap.containsKey(detail.getItemId())) {
				Stock merge = detailMap.get(detail.getItemId());
				// TODO ここモデルにメソッド持たせる
				merge.setCount(merge.getCount() + detail.getCount());
			} else {
				Stock stock = new Stock();
				stock.setItem_id(detail.getItemId());
				stock.setCount(detail.getCount());
				detailMap.put(detail.getItemId(), stock);
			}
		});
		
		// 在庫の更新
		stockLogic.register(detailMap);
		//　注文データの登録
		orderPersistenceLogic.save(order);
		// カートを初期化する
		cart.clearCart();
	}

}
