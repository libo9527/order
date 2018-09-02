package com.imooc.order.repository;

import com.imooc.order.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/9/2:16:27
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {
}
