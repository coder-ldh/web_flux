package com.ldh.controller;

import com.ldh.entity.User;
import com.ldh.result.JsonResult;
import com.ldh.service.UserService;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ldh Created on 2018/8/9
 */
@RestController
public class LoginController {

  @Autowired
  private  UserService userService;

  @PostMapping("/login")
  public JsonResult login(@RequestParam String name,@RequestParam String password){
    HashMap<String, Object> map = new HashMap<>();
    map.put("name",name);
    map.put("password",password);
    List<User> users = userService.selectByMap(map);
    return JsonResult.success("query success",users);
  }
}