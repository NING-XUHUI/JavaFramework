package com.xatu.ba04;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;
import java.util.concurrent.Exchanger;

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
    /**
     * 异常通知方法的定义格式
     * 1 public
     * 2 没有返回值
     * 3 方法名称自定义
     * 4 方法又一个Exception，如果还有就是JoinPoint
     */
    /**
     * @AfterThrowing: 异常通知方法的定义格式
     *      属性：1 value 切入点表达式
     *           2 throwing 自定义的变量，表示目标方法抛出的异常对象。变量名必须喝方法的参数名称一样
     *      特点：
     *      1 在目标方法抛出异常时执行的
     *      2 如果做异常的监控程序，监控木笔哦啊哦方法执行时是不是有异常
     *          如果有异常，可以发送邮件，短信通知
     * @param ex exception
     */
    @AfterThrowing(value = "execution(* *..SomeServiceImpl.doSecond(..))",
                throwing = "ex")
    public void myAfterThrowing(Exception ex) {
        System.out.println("异常通知：方法发生异常时，执行：" + ex.getMessage());
        // 发送邮件、短信等
    }

}
