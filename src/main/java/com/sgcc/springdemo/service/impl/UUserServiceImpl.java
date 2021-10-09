package com.sgcc.springdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mysql.cj.util.StringUtils;
import com.sgcc.springdemo.dao.UUserDao;
import com.sgcc.springdemo.entity.UUserEntity;
import com.sgcc.springdemo.service.UUserService;
import org.springframework.stereotype.Service;

import java.util.Date;


/**
 * null
 *
 * @author Caomingming  2021-10-09 09:51:55
 */
@Service
public class UUserServiceImpl extends ServiceImpl<UUserDao, UUserEntity> implements UUserService {

    @Override
    public Integer insertOrUpdateUser(UUserEntity uUserEntity) {
        Integer integer=null;
        if (StringUtils.isNullOrEmpty(uUserEntity.getId())) {
            Date date=new Date();
            uUserEntity.setId("uu"+date.getTime());
            integer = baseMapper.insert(uUserEntity);
        }else {
            integer = baseMapper.updateById(uUserEntity);
        }
        return integer;
    }

}
