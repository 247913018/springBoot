package com.sgcc.springdemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sgcc.springdemo.entity.UUserEntity;


/**
 * null
 *
 * @author Caomingming  2021-10-09 09:50:34
 */
public interface UUserService extends IService<UUserEntity> {

    /**
     * 新增或者修改用户信息
     * @param uUserEntity
     * @return
     */
    Integer insertOrUpdateUser(UUserEntity uUserEntity);

}
