package com.ldh.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.ldh.entity.User;
import com.ldh.result.JsonResult;
import com.ldh.service.UserService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 * @author ldh123
 * @since 2018-08-09
 */
@RestController
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping("/user")
  public JsonResult getList(){
    List<User> users = userService.selectList(new Wrapper<User>() {
      @Override
      public String getSqlSegment() {
        return null;
      }
    });
    return JsonResult.success("query success",users);
  }

  @PostMapping("/user")
  public JsonResult create(@RequestBody User user){
    String name = user.getName();
    if (StringUtils.isEmpty(name)){
      return JsonResult.failure("Parameter is wrong");
    }
    List<User> users = userService.selectList(new EntityWrapper<User>().eq("name",name));
    if (!CollectionUtils.isEmpty(users)){
      return JsonResult.failure("The user name has been registered");
    }
    boolean result = userService.insert(user);
    if (result){
      return JsonResult.success("create success");
    }
    return JsonResult.failure("create fail");
  }
}