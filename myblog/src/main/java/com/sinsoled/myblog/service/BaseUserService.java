package com.sinsoled.myblog.service;

import com.sinsoled.myblog.dto.LoginUser;
import com.sinsoled.myblog.model.BaseUser;

import java.util.List;

public interface BaseUserService {


    int updateBatch(List<BaseUser> list);

    int updateBatchSelective(List<BaseUser> list);

    int batchInsert(List<BaseUser> list);

    int insertOrUpdate(BaseUser record);

    int insertOrUpdateSelective(BaseUser record);

    /**
     * 用户登录
     *
     * @param username 用户名
     * @return
     */
    LoginUser login(String username);

}


