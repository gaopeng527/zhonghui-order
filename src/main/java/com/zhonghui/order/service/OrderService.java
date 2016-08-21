package com.zhonghui.order.service;

import java.util.List;

import com.huizhong.pojo.TbOrder;
import com.huizhong.pojo.TbOrderItem;
import com.huizhong.pojo.TbOrderShipping;
import com.zhonghui.common.pojo.ZhonghuiResult;

public interface OrderService {
	
	ZhonghuiResult createOrder(TbOrder order, List<TbOrderItem> itemList, TbOrderShipping orderShipping);
	
}
