 package com.test.dubbo.service;

import java.util.List;

import com.test.dubbo.bean.UserAddress;

public interface OrderService {
	
	/**
	 * 初始化订单
	 * @param userId
	 */
	public List<UserAddress> initOrder(String userId);

}
