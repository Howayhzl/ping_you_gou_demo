package cn.itcast.dubboxdemo.controller;


import cn.itcast.dubboxdemo.service.UserService;
import cn.itcast.dubboxdemo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

   @Autowired
    private UserServiceImpl userService;


    @RequestMapping("/showName")
    @ResponseBody
    public String showName(){
        System.out.println("555");
        System.out.println(userService.getName()+"888888");
        System.out.println("88888");
        return userService.getName();
    }

}
