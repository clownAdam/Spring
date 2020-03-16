package com.itlike.demo2;

/**
 * @ProjectName: Spring
 * @Package: com.itlike.demo2
 * @ClassName: Person
 * @Author: Administrator
 * @Description:
 * @Date: 2020/3/14 17:32
 * @Version: 1.0
 */
public class Person {
    public String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
    public void init(){
        System.out.println("person--init");
    }
    public void destroy(){
        System.out.println("person--destroy");
    }
}
