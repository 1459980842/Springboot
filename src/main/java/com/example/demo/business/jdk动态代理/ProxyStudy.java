package com.example.demo.business.jdk动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyStudy implements InvocationHandler {

    private IStudy iStudy;

    public ProxyStudy(IStudy iStudy){
        this.iStudy = iStudy;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result =null;
        result = method.invoke(iStudy,args);

        return result;
    }
}
