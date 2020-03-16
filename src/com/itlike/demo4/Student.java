package com.itlike.demo4;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @ProjectName: Spring
 * @Package: com.itlike.demo4
 * @ClassName: Student
 * @Author: Administrator
 * @Description:
 * @Date: 2020/3/15 23:24
 * @Version: 1.0
 */
public class Student {
    public String name;
    public Integer age;
    public Dog dog;
    public String dogName;
    public Integer dogAge;
    public String attr[];
    public List myList;
    public Set mySet;
    public Map myMap;

    public void setMyMap(Map myMap) {
        this.myMap = myMap;
    }

    public void setMySet(Set mySet) {
        this.mySet = mySet;
    }

    public void setMyList(List myList) {
        this.myList = myList;
    }

    public void setAttr(String[] attr) {
        this.attr = attr;
    }

    public void setDogAge(Integer dogAge) {
        this.dogAge = dogAge;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dog=" + dog +
                ", dogName='" + dogName + '\'' +
                ", dogAge=" + dogAge +
                '}';
    }
}
