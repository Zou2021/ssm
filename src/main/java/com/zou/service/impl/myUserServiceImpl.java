package com.zou.service.impl;

import com.zou.mapper.MyUserMapper;
import com.zou.po.MyUser;
import com.zou.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class myUserServiceImpl implements MyUserService {

    //set方法注入
    MyUserMapper myUserMapper;

    @Autowired
    public void setMyUserMapper(MyUserMapper myUserMapper) {
        this.myUserMapper = myUserMapper;
    }

    public List<MyUser> selectList() throws Exception {
        // TODO Auto-generated method stub
        return myUserMapper.selectList();
    }

    public void delete(int id) throws Exception {
        myUserMapper.delete(id);
    }

    @Override
    public void insertUser(MyUser myUser) throws Exception {
        myUserMapper.insertUser(myUser);
    }

    @Override
    public void updateUser(MyUser myUser) throws Exception {
        myUserMapper.updateUser(myUser);
    }

    @Override
    public MyUser selectById(Integer id) throws Exception {
        return myUserMapper.selectById(id);
    }
}
