package com.sgcc.springdemo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sgcc.springdemo.entity.UUserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UUserDao extends BaseMapper<UUserEntity> {
}
