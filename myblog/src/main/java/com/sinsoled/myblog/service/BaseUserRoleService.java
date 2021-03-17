package com.sinsoled.myblog.service;

import com.sinsoled.myblog.model.BaseUserRole;

import java.util.List;

public interface BaseUserRoleService {


    int updateBatch(List<BaseUserRole> list);

    int updateBatchSelective(List<BaseUserRole> list);

    int batchInsert(List<BaseUserRole> list);

    int insertOrUpdate(BaseUserRole record);

    int insertOrUpdateSelective(BaseUserRole record);

}
