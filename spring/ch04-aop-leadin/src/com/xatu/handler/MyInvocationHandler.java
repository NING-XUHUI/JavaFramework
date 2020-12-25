package com.xatu.handler;

import com.xatu.util.ServiceTools;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author ningxuhui
 */

public class MyInvocationHandler implements InvocationHandler {
    /**
     * SomeServiceImpl类
     */

    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 通过代理对象执行方法是，会执行这个invoke（）
        System.out.println("执行MyInvocationHandler");
        Object res = null;
        ServiceTools.doLog();
        // 执行目标类的方法，通过Method类实现
        // SomeServiceImpl.doOther(),doSome()
        res = method.invoke(target, args);

        ServiceTools.doTrans();
        return res;
    }
}
