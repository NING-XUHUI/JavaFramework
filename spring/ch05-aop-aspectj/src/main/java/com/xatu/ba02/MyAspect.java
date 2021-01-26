package com.xatu.ba02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

/**
 * @author ningxuhui
 * @Aspect : 是aspectj框架的注解
 * 作用：表示当前类是切面类
 * 切面类：是用来给业务方法添加功能的类，在这个类中有切面的功能代码
 * 位置：在类定义的上面
 * @Aspect : 是aspectj框架的注解
 * 作用：表示当前类是切面类
 * 切面类：是用来给业务方法添加功能的类，在这个类中有切面的功能代码
 * 位置：在类定义的上面
 * @Aspect : 是aspectj框架的注解
 * 作用：表示当前类是切面类
 * 切面类：是用来给业务方法添加功能的类，在这个类中有切面的功能代码
 * 位置：在类定义的上面
 */

/**
 * @Aspect : 是aspectj框架的注解
 * 作用：表示当前类是切面类
 * 切面类：是用来给业务方法添加功能的类，在这个类中有切面的功能代码
 * 位置：在类定义的上面
 */

/**
 * @author ningxuhui
 * @AfterReturning 后置通知
 * value：切入点表达式
 * returning：自定义的遍历，表示目标方法的返回值
 * 自定义变量名必须和通知方法的形参名意义
 * 位置：在方法定义的上面'
 * 特点：
 *  1 在目标方法之后执行
 *  2 能够获取到目标方法的返回值，可以根据这个返回值做不同的处理功能
 *  3 可以修改这个返回值
 *
 *  后置通知的执行
 *  Object res = doOther()
 *  myAfterReturing
 */

@Aspect
public class MyAspect {
    @AfterReturning(value = "execution(public String com.xatu.ba02.SomeServiceImpl.doOther(..))",
            returning = "res")
    public void myAfterReturing(JoinPoint jp, Object res) {
        System.out.println(jp.getSignature());
        // Object res：是目标方法执行后的返回值，根据返回值做你的切面的功能处理
        System.out.println("后置通知：在目标方法后执行，获取的返回值是：" + res);
        if (res.equals("abcd")) {
            //...
        } else {
            //...
        }
        if (res != null) {
            res = "Hello Aspectj";
        }
    }
}
