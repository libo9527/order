package com.imooc.order.repository;

import com.imooc.order.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/9/2:16:29
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
}
