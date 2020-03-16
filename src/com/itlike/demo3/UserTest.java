package com.itlike.demo3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ProjectName: Spring
 * @Package: com.itlike.demo3
 * @ClassName: UserTest
 * @Author: Administrator
 * @Description:
 * @Date: 2020/3/15 17:34
 * @Version: 1.0
 */
public class UserTest {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.println("user = " + user);
    }
}
