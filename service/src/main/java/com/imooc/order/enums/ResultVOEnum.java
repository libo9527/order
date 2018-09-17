package com.imooc.order.enums;

import lombok.Getter;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/9/2:12:51
 */
@Getter
public enum ResultVOEnum {
    OK(0,"成功");

    private Integer code;

    private String message;

    ResultVOEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
