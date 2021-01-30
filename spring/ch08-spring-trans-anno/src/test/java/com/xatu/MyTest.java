package com.xatu;

import com.xatu.service.BuyGoodsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ningxuhui
 */

public class MyTest {
    @Test
    public void Test01() {
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);

        BuyGoodsService service = (BuyGoodsService) ctx.getBean("buyService");
        System.out.println(service.getClass().getName());
        service.buy(1001, 200);
    }
}
