package com.itlike.demo4;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @ProjectName: Spring
 * @Package: com.itlike.demo4
 * @ClassName: StudentTest
 * @Author: Administrator
 * @Description:
 * @Date: 2020/3/15 23:32
 * @Version: 1.0
 */
public class StudentTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student);
//        System.out.println("student.age = " + student.age);
//        System.out.println(student.dog.name);
        System.out.println(Arrays.toString(student.attr));
        System.out.println(student.myList);
        System.out.println(student.mySet);
        System.out.println(student.myMap);
    }
}
