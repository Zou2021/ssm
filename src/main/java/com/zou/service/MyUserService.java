package com.zou.service;

import com.zou.po.MyUser;

import java.util.List;

public interface MyUserService {

    List<MyUser> selectList() throws Exception;

    void delete(int id) throws Exception;

    void insertUser(MyUser myUser) throws Exception;

    void updateUser(MyUser myUser) throws Exception;

    MyUser selectById(Integer id) throws Exception;

}
