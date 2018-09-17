package com.imooc.order.enums;

import lombok.Getter;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/9/2:16:33
 */
@Getter
public enum OrderStatusEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "取消")
    ;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
