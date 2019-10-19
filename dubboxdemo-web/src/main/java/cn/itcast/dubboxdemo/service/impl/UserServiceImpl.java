package cn.itcast.dubboxdemo.service.impl;


import cn.itcast.dubboxdemo.service.UserService;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    public String getName() {
        return "itcast";
    }
}
