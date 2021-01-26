package com.xatu.ba05;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

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
     * 最终通知方法的定义格式
     * 1 public
     * 2 没有返回值
     * 3 方法名称自定义
     * 4 方法没有参数，如果有就是JoinPoint
     */
    /**
     * @After: 最终通知
     *      属性：value 切入点表达式
     *      位置：在方法的上面
     *  特点：
     *  1 总是会执行
     *  2 在目标方法之后执行
     */
    @After(value = "execution(* *..SomeServiceImpl.doThird(..))")
    public void myAfter() {
        System.out.println("执行最终通知，总会执行的代码");
        // 一般做资源清除工作
    }
}
