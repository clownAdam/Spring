package com.itlike.demo3;

/**
 * @ProjectName: Spring
 * @Package: com.itlike.demo3
 * @ClassName: User
 * @Author: Administrator
 * @Description:
 * @Date: 2020/3/15 17:32
 * @Version: 1.0
 */
public class User {
//    public User(){
//        super();;
//        System.out.println("默认构造方法");
//    }

    /**
     * createUser
     * @return user
     */
    public static User createUser(){
        System.out.println("调用了createUser----------");
        return new User();
    }

}
