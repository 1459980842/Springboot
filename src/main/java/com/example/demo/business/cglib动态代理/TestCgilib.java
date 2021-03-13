package com.example.demo.business.cglib动态代理;

import org.springframework.cglib.proxy.Enhancer;

public class TestCgilib {


    public static void main(String[] args) {
        /**
         * 该类为CGLib设置动态代理的核心，你设置一个怎么样的动态代理
         */
        Enhancer enhancer = new Enhancer();
        /*******设置需要被代理的类**************/
        enhancer.setSuperclass(Iboy.class);
        /*******设置代理类**************/
        enhancer.setCallback(new CgilibProxy());
        /*******创建代理类**************/
        Iboy iboy = (Iboy) enhancer.create();
        iboy.eat();
    }
}
