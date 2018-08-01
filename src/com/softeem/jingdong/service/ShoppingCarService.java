package com.softeem.jingdong.service;

import com.softeem.jingdong.entity.GoodsBean;

public interface ShoppingCarService {
	
	//将商品添加到购物车中，返回的是商品类型的数据
	public GoodsBean addGoodsToShoppingCar(int id);
	
}
