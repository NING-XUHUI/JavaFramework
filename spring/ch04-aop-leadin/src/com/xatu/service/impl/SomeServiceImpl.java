package com.xatu.service.impl;

import com.xatu.service.SomeService;
import com.xatu.util.ServiceTools;

import java.util.Date;

/**
 * @author ningxuhui
 */
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("执行业务方法doSome");
    }

    @Override
    public void doOther() {
        System.out.println("执行业务方法doOther");
    }
}
