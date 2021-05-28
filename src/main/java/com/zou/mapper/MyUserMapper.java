package com.zou.mapper;


import com.zou.po.MyUser;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface MyUserMapper {

    @Select("select * from user")
    List<MyUser> selectList() throws Exception;

    @Delete("delete from user where id=#{id}")
    void delete(int id) throws Exception;

    @Insert("insert into user (name,age,sex) VALUES (#{name},#{age},#{sex})")
    void insertUser(MyUser myUser) throws Exception;

    @Update("update user set name=#{name},age=#{age},sex=#{sex} WHERE id=#{id}")
    void updateUser(MyUser myUser) throws Exception;

    @Select("select * from user where id = #{id}")
    MyUser selectById(Integer id) throws Exception;

}
