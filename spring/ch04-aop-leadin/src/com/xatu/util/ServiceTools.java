package com.xatu.util;

import java.util.Date;

/**
 * @author ningxuhui
 */

public class ServiceTools {
    public static void doLog() {
        System.out.println("方法的执行时间：" + new Date());
    }

    public static void doTrans() {
        System.out.println("方法执行完毕后，提交事务");
    }
}
