package com.xatu.ba01;

/**
 * @author ningxuhui
 */

// 目标类
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name, Integer age) {
        // 给doSome添加一个功能，在执行之前，输出方法的执行时间
        System.out.println("=====目标方法doSome()=====");
    }
}
