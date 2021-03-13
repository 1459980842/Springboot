package com.example.demo.business.cglib动态代理;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CgilibProxy implements MethodInterceptor {




    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("111");
        Object o2 = methodProxy.invokeSuper(o, objects);
        System.out.println("222");
        return o2;
    }
}
