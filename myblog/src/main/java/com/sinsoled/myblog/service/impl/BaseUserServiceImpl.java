package com.sinsoled.myblog.service.impl;

import com.sinsoled.myblog.dto.LoginUser;
import com.sinsoled.myblog.mapper.BaseUserMapper;
import com.sinsoled.myblog.model.BaseUser;
import com.sinsoled.myblog.service.BaseUserService;
import com.sinsoled.myblog.vo.RegisterUserVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BaseUserServiceImpl implements BaseUserService {

    @Resource
    private BaseUserMapper baseUserMapper;

    @Override
    public int updateBatch(List<BaseUser> list) {
        return baseUserMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<BaseUser> list) {
        return baseUserMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<BaseUser> list) {
        return baseUserMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(BaseUser record) {
        return baseUserMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(BaseUser record) {
        return baseUserMapper.insertOrUpdateSelective(record);
    }

    @Override
    public LoginUser login(String username) {
        return baseUserMapper.getUserByUsername(username);
    }

    @Override
    public String register(RegisterUserVO registerUserVO) {
        return null;
    }
}


