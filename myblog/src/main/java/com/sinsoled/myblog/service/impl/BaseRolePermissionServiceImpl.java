package com.sinsoled.myblog.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.sinsoled.myblog.model.BaseRolePermission;
import com.sinsoled.myblog.mapper.BaseRolePermissionMapper;
import com.sinsoled.myblog.service.BaseRolePermissionService;
@Service
public class BaseRolePermissionServiceImpl implements BaseRolePermissionService{

    @Resource
    private BaseRolePermissionMapper baseRolePermissionMapper;

    @Override
    public int updateBatch(List<BaseRolePermission> list) {
        return baseRolePermissionMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<BaseRolePermission> list) {
        return baseRolePermissionMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<BaseRolePermission> list) {
        return baseRolePermissionMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(BaseRolePermission record) {
        return baseRolePermissionMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(BaseRolePermission record) {
        return baseRolePermissionMapper.insertOrUpdateSelective(record);
    }

}
