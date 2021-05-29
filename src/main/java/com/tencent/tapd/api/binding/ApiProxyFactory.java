package com.tencent.tapd.api.binding;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import com.tencent.tapd.api.binding.ApiProxy.ApiInvocationHandler;

public class ApiProxyFactory<T> {

    private final Class<T> apiInterface;
    private final Map<Method, ApiInvocationHandler> METHOD_CACHE = new HashMap<>();

    public ApiProxyFactory(Class<T> apiInterface) {
        this.apiInterface = apiInterface;
    }

    public T newInstance() {
        ApiProxy<T> apiProxy = new ApiProxy<>(apiInterface, METHOD_CACHE);

        return (T) Proxy.newProxyInstance(apiInterface.getClassLoader(), new Class[]{apiInterface}, apiProxy);
    }

}