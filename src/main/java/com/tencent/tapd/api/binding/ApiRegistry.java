package com.tencent.tapd.api.binding;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <p>Module: 应用模块
 * <p>Description: 代码描述
 * <p>Author: <a href='mailto:2075904@qq.com'>Zhengyu.Hu</a>
 * <p>Date: 2021/5/29 5:37 下午
 * <p>Copyright (c) 2021年 Chengdu Minto Technology Co.,LTD.
 */
@SuppressWarnings("unchecked")
public class ApiRegistry {
    private static final ApiRegistry INSTANCE = new ApiRegistry();
    private final Map<Class<?>, ApiProxyFactory<?>> API_PROXY = new ConcurrentHashMap<>();

    public static ApiRegistry getInstance(){
        return INSTANCE;
    }

    /**
     * 获取接口api
     * @param apiClass
     * @param <T>
     * @return
     */
    public <T> T getApi(Class<T> apiClass){
        return (T) API_PROXY.computeIfAbsent(apiClass, ApiProxyFactory::new).newInstance();
    }
}
