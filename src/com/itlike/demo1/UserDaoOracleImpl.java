package com.itlike.demo1;

/**
 * @ProjectName: Spring
 * @Package: com.itlike.demo1
 * @ClassName: UserDaoMySQLImpl
 * @Author: Administrator
 * @Description:
 * @Date: 2020/3/14 16:38
 * @Version: 1.0
 */
public class UserDaoOracleImpl implements UserDao  {
    public String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void save() {
        System.out.println("oracle---save");
    }

    @Override
    public void delete() {
        System.out.println("oracle---delete");
    }
}
