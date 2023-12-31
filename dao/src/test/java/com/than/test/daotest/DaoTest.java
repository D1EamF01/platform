package com.than.test.daotest;


import com.than.dao.GroupDao;
import com.than.dao.user.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DaoTest {
    @Autowired
    UserDao userDao;

    @Test
    void testBool(){

        System.out.println(userDao.isUserNameExist("2345"));

    }

    @Test
    void testUserDao(){
//        UserBean userBean1 = new UserBean();
//        userBean1.setAccount("1234");
//        userBean1.setPassword("1234");
//        userBean1.setName("ry");
//        userBean1.setCreate_time(new Timestamp(System.currentTimeMillis()));
//        System.out.println(userDao.insertUser(userBean1));

//        System.out.println(userDao.getAllUsers());
//
//        userDao.deleteUserByAccount("1234");
//
//        System.out.println(userDao.getAllUsers());


        // 自动生成部分测试
//        UserBean userBean = new UserBean("test", "123456");
//        userDao.insertUser(userBean);
////
////        System.out.println(userDao.getAllUsers());
//
//        userBean.setAccount("13813400980800");
//        System.out.println(userDao.updateUserByAccount(userBean));

//        System.out.println(userDao.getUserByAccount("1"));

//        userBean.setAccount("1");
//        userDao.updateUserByAccount(userBean);
    }

    @Autowired
    GroupDao groupDao;
    @Test
    void testGroupDao(){
//        System.out.println(groupDao.getAllGroups());

//        System.out.println(groupDao.getByGroupAccount("123"));

//        groupDao.deleteGroupByGroupAccount("1693152770810");

        // 自动生成部分测试
//        GroupBean groupBean = new GroupBean("hello test new fix", "111", 100, 1000);
////        groupDao.insertUser(groupBean);
////
////        System.out.println(groupDao.getAllGroups());
////        groupBean.setGroup_account("11111111111");
////        groupBean.setGroup_creator_account("12311");
//
////        System.out.println(groupDao.insertGroup(groupBean));
////        System.out.println(groupDao.updateByGroupAccount(groupBean));
//        groupDao.insertGroup(groupBean);
//        groupBean.setGroup_owner_account("111222333");
//        System.out.println(groupDao.updateByGroupAccount(groupBean));
//
//        groupDao.updateGroupCreatorAccount("332211", groupBean.getGroup_account());

    }
}
