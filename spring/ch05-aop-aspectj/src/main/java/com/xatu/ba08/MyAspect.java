package com.xatu.ba08;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {

    @After(value = "mypt()")
    public void myAfter() {
        System.out.println("执行最终通知，总会执行的代码");
        // 一般做资源清除工作
    }
    @Before(value = "mypt()")
    public void myBefore() {
        System.out.println("执行前置通知，在目标方法之前");
        // 一般做资源清除工作
    }

    /**
     * @Pointcut: 定义和管理切入点的，如果项目中有多个切入点表达式，可以复用的
     *              则可以使用@Pointcut
     *      属性：value 切入点表达式
     *      位置：在自定义的方法的上面
     *   特点：
     *      当使用@Pointcut定义在一个方法的上面，此时这个方法的名称就是切入点表达式的别名
     *      其他的通知中，value属性就可以使用这个方法的名称，代替切入点表达式
     */
    @Pointcut(value = "execution(* *..SomeServiceImpl.doThird(..))")
    public void mypt() {
        // 无需代码
    }
}
