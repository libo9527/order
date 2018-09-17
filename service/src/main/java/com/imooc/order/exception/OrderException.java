package com.imooc.order.exception;

import com.imooc.order.enums.ResultEnum;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/9/2:18:03
 */
public class OrderException extends RuntimeException {
    private Integer code;

    public OrderException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public OrderException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
