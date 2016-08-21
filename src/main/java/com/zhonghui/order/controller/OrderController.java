package com.zhonghui.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
/**
 * 订单Controller
 * @author DELL
 *
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhonghui.common.pojo.ZhonghuiResult;
import com.zhonghui.common.utils.ExceptionUtil;
import com.zhonghui.order.pojo.Order;
import com.zhonghui.order.service.OrderService;
@Controller
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping("/create")
	@ResponseBody
	public ZhonghuiResult createOrder(@RequestBody Order order){
		try {
			ZhonghuiResult result = orderService.createOrder(order, order.getOrderItems(), order.getOrderShipping());
			return result;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ZhonghuiResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}
}
