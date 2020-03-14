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
public class UserDaoMysqlImpl implements UserDao  {
    @Override
    public void save() {
        System.out.println("mysql---save");
    }

    @Override
    public void delete() {
        System.out.println("mysql---delete");
    }
}
