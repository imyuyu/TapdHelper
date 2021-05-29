package com.tencent.tapd.api.binding;

import org.springframework.beans.factory.FactoryBean;

/**
 * <p>Module: 应用模块
 * <p>Description: 代码描述
 * <p>Author: <a href='mailto:2075904@qq.com'>Zhengyu.Hu</a>
 * <p>Date: 2021/5/29 5:13 下午
 * <p>Copyright (c) 2021年 Chengdu Minto Technology Co.,LTD.
 */
public class ApiProxyFactoryBean<T> implements FactoryBean<T> {

    private final Class<T> apiInterface;

    public ApiProxyFactoryBean(Class<T> apiInterface) {
        this.apiInterface = apiInterface;
    }

    @Override
    public T getObject() throws Exception {
        return ApiRegistry.getInstance().getApi(apiInterface);
    }

    @Override
    public Class<?> getObjectType() {
        return apiInterface;
    }
}
