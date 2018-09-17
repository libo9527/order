package com.imooc.order.enums;

import lombok.Getter;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/9/2:18:05
 */
@Getter
public enum ResultEnum {
    PARAM_ERROR(1, "参数错误"),
    CART_EMPTY(2, "购物车为空"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
