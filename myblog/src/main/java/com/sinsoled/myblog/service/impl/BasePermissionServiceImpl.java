package com.sinsoled.myblog.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.sinsoled.myblog.model.BasePermission;
import com.sinsoled.myblog.mapper.BasePermissionMapper;
import com.sinsoled.myblog.service.BasePermissionService;
@Service
public class BasePermissionServiceImpl implements BasePermissionService{

    @Resource
    private BasePermissionMapper basePermissionMapper;

    @Override
    public int updateBatch(List<BasePermission> list) {
        return basePermissionMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<BasePermission> list) {
        return basePermissionMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<BasePermission> list) {
        return basePermissionMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(BasePermission record) {
        return basePermissionMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(BasePermission record) {
        return basePermissionMapper.insertOrUpdateSelective(record);
    }

}
