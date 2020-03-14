package com.itlike.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ProjectName: Spring
 * @Package: com.itlike.demo1
 * @ClassName: UserTest
 * @Author: Administrator
 * @Description:
 * @Date: 2020/3/14 16:43
 * @Version: 1.0
 */
public class UserTest {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.save();
    }
}
