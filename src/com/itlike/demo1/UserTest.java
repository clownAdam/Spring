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
    /**
     * IOC 控制反转
     */
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.save();
    }

    /**
     * DI 依赖注入
     * 实现类中的属性要提供set()方法
     * 在配置文件当中配置依赖注入
     */
    @Test
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDaoOracleImpl userDao = (UserDaoOracleImpl) applicationContext.getBean("userDao");
        System.out.println(userDao.name);
    }
}
