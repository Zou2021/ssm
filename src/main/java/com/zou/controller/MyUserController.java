package com.zou.controller;

import com.zou.po.MyUser;
import com.zou.service.MyUserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MyUserController {

    @Resource
    MyUserService myUserService;

    //展示数据
    @RequestMapping("/getUser.do")
    public ModelAndView myUserList() throws Exception {
        List<MyUser> list = myUserService.selectList();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list", list);
        modelAndView.setViewName("userList");
        return modelAndView;
    }

    //删除方法
    @RequestMapping("/del.do")
    public String delete(Integer id) throws Exception {
        myUserService.delete(id);
        return "redirect:getUser.do";
    }

    //添加方法（跳转页面）
    @RequestMapping("/add.do")
    public ModelAndView add() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("add");
        return modelAndView;
    }

    //添加方法（设置数据）
    @RequestMapping("/addUser.do")
    public String add(String name, Integer age, String sex) throws Exception {
        MyUser user = new MyUser();
        user.setName(name);
        user.setAge(age);
        user.setSex(sex);
        myUserService.insertUser(user);

        return "redirect:getUser.do";
    }

    //修改方法（跳转页面）
    @RequestMapping("/edit.do")
    public ModelAndView up(Integer id) throws Exception {
        System.out.println("请求修改方法");
        MyUser user = myUserService.selectById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", user);
        modelAndView.setViewName("edit");

        return modelAndView;
    }

    //修改方法（更新数据）
    @RequestMapping("/editUser.do")
    public String edit(@Param("id") Integer id,
                       @Param("name") String name,
                       @Param("age") Integer age,
                       @Param("sex") String sex) throws Exception {
        MyUser user = new MyUser();
        user.setId(id);
        user.setName(name);
        user.setAge(age);
        user.setSex(sex);
        myUserService.updateUser(user);

        return "redirect:getUser.do";
    }
}