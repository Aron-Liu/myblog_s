package com.sinsoled.myblog.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.sinsoled.myblog.mapper.BaseRoleMapper;
import com.sinsoled.myblog.model.BaseRole;
import com.sinsoled.myblog.service.BaseRoleService;
@Service
public class BaseRoleServiceImpl implements BaseRoleService{

    @Resource
    private BaseRoleMapper baseRoleMapper;

    @Override
    public int updateBatch(List<BaseRole> list) {
        return baseRoleMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<BaseRole> list) {
        return baseRoleMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<BaseRole> list) {
        return baseRoleMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(BaseRole record) {
        return baseRoleMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(BaseRole record) {
        return baseRoleMapper.insertOrUpdateSelective(record);
    }

}
