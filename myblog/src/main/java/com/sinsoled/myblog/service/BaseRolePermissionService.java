package com.sinsoled.myblog.service;

import com.sinsoled.myblog.model.BaseRolePermission;

import java.util.List;

public interface BaseRolePermissionService {


    int updateBatch(List<BaseRolePermission> list);

    int updateBatchSelective(List<BaseRolePermission> list);

    int batchInsert(List<BaseRolePermission> list);

    int insertOrUpdate(BaseRolePermission record);

    int insertOrUpdateSelective(BaseRolePermission record);

}
