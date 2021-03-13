package com.example.demo.business.jdk动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        IStudy iStudy = new MyStudy();
        InvocationHandler invocationHandler = new ProxyStudy(iStudy);
        IStudy iStudyproxy = (IStudy) Proxy.newProxyInstance(iStudy.getClass().getClassLoader(), iStudy.getClass().getInterfaces(), invocationHandler);

        iStudyproxy.read();
    }
}
