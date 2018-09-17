package com.imooc.order.enums;

import lombok.Getter;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/9/2:16:36
 */
@Getter
public enum PayStatusEnum {
    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),
    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
