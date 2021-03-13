package com.example.demo.business.jdk动态代理;

public class MyStudy implements IStudy{
    @Override
    public void read() {
        System.out.println("接口实现类");
    }
}
