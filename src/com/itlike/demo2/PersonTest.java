package com.itlike.demo2;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ProjectName: Spring
 * @Package: com.itlike.demo2
 * @ClassName: PersonTest
 * @Author: Administrator
 * @Description:
 * @Date: 2020/3/14 17:32
 * @Version: 1.0
 */
public class PersonTest {
    @Test
    public void test(){
        //加载配置文件，便会创建对象
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("hello");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
        applicationContext.close();
    }
}
