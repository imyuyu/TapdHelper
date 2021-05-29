package com.tencent.tapd.api.binding;

import com.tencent.tapd.api.annotation.Api;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * <p>Module: 应用模块
 * <p>Description: 代码描述
 * <p>Author: <a href='mailto:2075904@qq.com'>Zhengyu.Hu</a>
 * <p>Date: 2021/5/29 5:37 下午
 * <p>Copyright (c) 2021年 Chengdu Minto Technology Co.,LTD.
 */
public class ApiProxy<T> implements InvocationHandler, Serializable {

    private Class<T> apiInterface;
    private Map<Method, ApiInvocationHandler> methodCache;

    public ApiProxy(Class<T> apiInterface, Map<Method, ApiInvocationHandler> methodCache) {
        this.apiInterface = apiInterface;
        this.methodCache = methodCache;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (Object.class.equals(method.getDeclaringClass())) {
            return method.invoke(this, args);
        } else {
            Api api = method.getAnnotation(Api.class);
            if(api == null){
                throw new IllegalAccessException("不支持的方法："+method.getName());
            }
            return cachedInvoker(method).invoke(proxy, method, args, api);
        }
    }

    private ApiInvocationHandler cachedInvoker(Method method) {
        return methodCache.computeIfAbsent(method, m -> {
            ApiInvocationHandler apiInvocationHandler = null;
            if(m.isDefault()){

            }else{
                apiInvocationHandler = new DefaultInvocationHandler();
            }
            return apiInvocationHandler;
        });
    }

    interface ApiInvocationHandler {

        Object invoke(Object proxy, Method method, Object[] args,Api api) throws Throwable;
    }

    class DefaultInvocationHandler implements ApiInvocationHandler {

        @Override
        public Object invoke(Object proxy, Method method, Object[] args, Api api) throws Throwable {

            String url = api.value();

            if(args.length > 0){

            }

            return null;
        }
    }

    static class EmptyInvocationHandler implements ApiInvocationHandler {

        public static final EmptyInvocationHandler INSTANCE = new EmptyInvocationHandler();

        @Override
        public Object invoke(Object proxy, Method method, Object[] args, Api api) throws Throwable {
            return null;
        }
    }
}
