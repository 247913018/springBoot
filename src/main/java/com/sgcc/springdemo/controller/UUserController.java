package com.sgcc.springdemo.controller;

import com.alibaba.fastjson.JSONObject;
import com.sgcc.springdemo.config.ResponseResult;
import com.sgcc.springdemo.entity.UUserEntity;
import com.sgcc.springdemo.service.UUserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/uUser")
public class UUserController {

    @Resource
    private UUserService uUserService;


    @RequestMapping(value = "/insertOrUpdateUser", method = RequestMethod.POST, headers = "Content-type=application/json")
    public ResponseResult<Integer> insertOrUpdateUser(@RequestBody JSONObject param){
        JSONObject data = param.getJSONObject("data");
        UUserEntity uUserEntity = data.toJavaObject(UUserEntity.class);
        return ResponseResult.success(uUserService.insertOrUpdateUser(uUserEntity));
    }
}
