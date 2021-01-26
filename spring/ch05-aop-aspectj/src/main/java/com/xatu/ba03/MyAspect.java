package com.xatu.ba03;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

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
    /***
     * 环绕通知定义格式
     * 1 public
     * 2 必须有一个返回值，推荐使用Object
     * 3 方法名称自定义
     * 4 方法有参数，固定的参数ProceedingJoinPoint
     */
    /**
     * @ Around 环绕通知
     *      属性：value 切入点表达式
     *      位置：在方法的定义上面
     * 特点：
     *      1 他是功能最强的通知
     *      2 在目标方法的谦和后都能增强功能
     *      3 控制目标方法是否被执行
     *      4 修改原来的目标方法的执行结果。影响最后的调用结果
     *
     *      环绕通知，等同于jdk动态代理，InvocationHandler接口
     *
     *
     * @param pjp ProceedingJoinPoint 等同于Method
     *             作用：执行目标方法的
     * @return Object 目标方法的执行结果，可以被就该
     */
    @Around(value = "execution(* *..someServiceImpl.doFirst(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        // 实现环绕通知
        Object result = null;
        System.out.println("环绕通知：在目标方法之前，输出时间：" + new Date(()));
        // 1.目标方法调用
        result = pjp.proceed();
        // 2.在目标方法的前或者后加入功能
        System.out.println("环绕通知：在目标方法之后，提交事务";
        // 返回目标方法的实质性结果
        return result;
    }
}
