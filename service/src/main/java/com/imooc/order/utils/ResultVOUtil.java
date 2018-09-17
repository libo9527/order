package com.imooc.order.utils;

import com.imooc.order.VO.ResultVO;
import com.imooc.order.enums.ResultVOEnum;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/9/2:12:50
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO<Object> resultVO = new ResultVO<>(ResultVOEnum.OK);
        resultVO.setData(object);
        return resultVO;
    }
}
