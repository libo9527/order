package com.imooc.order.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @Description:
 * @Author: LiBo
 * @Date: 2018/8/12下午 12:28
 */
public class JsonUtil {

    /**
     * 转换为json字符串
     * @param object
     * @return
     */
    public static String toJson(Object object){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }

    /**
     * 转换为对象
     * @param jsonString
     * @param classOfT
     * @return
     */
    public static Object fromJson(String jsonString, Class classOfT){
        Gson gson = new Gson();
        return gson.fromJson(jsonString, classOfT);
    }
}
