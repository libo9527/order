package com.imooc.order.message;

import com.imooc.order.utils.JsonUtil;
import com.imooc.product.common.ProductInfoOutput;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/9/18:22:18
 */
@Slf4j
@Component
public class ProductInfoReceiver {

    private static final String PRODUCT_STOCK_TEMPLATE = "product_stock_%s";

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RabbitListener(queuesToDeclare = @Queue("productInfo"))
    public void process(String message) {
        // message => ProductInfoOutput
        ProductInfoOutput productInfoOutput = (ProductInfoOutput) JsonUtil.fromJson(message, ProductInfoOutput.class);
        log.info("从队列【{}】接收到消息：{}", "productInfo", productInfoOutput);

        // 存储到缓存redis中
        stringRedisTemplate.opsForValue().set(
                String.format(PRODUCT_STOCK_TEMPLATE, productInfoOutput.getProductId()),
                String.valueOf(productInfoOutput.getProductStock()));
    }
}
