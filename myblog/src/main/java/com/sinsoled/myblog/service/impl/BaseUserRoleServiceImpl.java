package com.sinsoled.myblog.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.sinsoled.myblog.model.BaseUserRole;
import java.util.List;
import com.sinsoled.myblog.mapper.BaseUserRoleMapper;
import com.sinsoled.myblog.service.BaseUserRoleService;
@Service
public class BaseUserRoleServiceImpl implements BaseUserRoleService{

    @Resource
    private BaseUserRoleMapper baseUserRoleMapper;

    @Override
    public int updateBatch(List<BaseUserRole> list) {
        return baseUserRoleMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<BaseUserRole> list) {
        return baseUserRoleMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<BaseUserRole> list) {
        return baseUserRoleMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(BaseUserRole record) {
        return baseUserRoleMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(BaseUserRole record) {
        return baseUserRoleMapper.insertOrUpdateSelective(record);
    }

}
