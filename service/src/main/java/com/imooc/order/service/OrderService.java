package com.imooc.order.service;

import com.imooc.order.dto.OrderDTO;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/9/2:17:39
 */
public interface OrderService {

    /**
     * 创建订单
     * @param orderDTO
     * @return
     */
    OrderDTO create(OrderDTO orderDTO);
}
