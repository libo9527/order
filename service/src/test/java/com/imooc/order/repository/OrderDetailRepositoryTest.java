package com.imooc.order.repository;

import com.imooc.order.OrderApplicationTests;
import com.imooc.order.dataobject.OrderDetail;
import com.netflix.discovery.converters.Auto;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/9/2:17:33
 */
@Component
public class OrderDetailRepositoryTest extends OrderApplicationTests {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void saveTest() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("123456");
        orderDetail.setOrderId("123456");
        orderDetail.setProductId("123456");
        orderDetail.setProductName("皮蛋粥");
        orderDetail.setProductPrice(new BigDecimal(2.3));
        orderDetail.setProductIcon("www.xxx.jpg");
        orderDetail.setProductQuantity(2);

        OrderDetail result = orderDetailRepository.save(orderDetail);
        Assert.assertTrue(result != null);
    }

}