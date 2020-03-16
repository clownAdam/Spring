package com.itlike.demo4;

/**
 * @ProjectName: Spring
 * @Package: com.itlike.demo4
 * @ClassName: Dog
 * @Author: Administrator
 * @Description:
 * @Date: 2020/3/16 15:35
 * @Version: 1.0
 */
public class Dog {
    public String name;
    public Integer age;
    public String color;

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
