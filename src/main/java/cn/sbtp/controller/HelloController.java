package cn.sbtp.controller;

import cn.sbtp.model.User;
import cn.sbtp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HelloController {

    @Autowired
    private UserService userService;

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/getUsers", method = RequestMethod.POST)
    public Map getUsers(){
        List<User> users = userService.getUsers();
        Map map = new HashMap();
        map.put("status", 1);
        map.put("userList", users);
        return map;
    }


}
