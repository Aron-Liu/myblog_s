package com.sinsoled.myblog.service;

import com.sinsoled.myblog.dto.BasePermissionDTO;
import com.sinsoled.myblog.model.BasePermission;

import java.util.List;

public interface BasePermissionService {


    int updateBatch(List<BasePermission> list);

    int updateBatchSelective(List<BasePermission> list);

    int batchInsert(List<BasePermission> list);

    int insertOrUpdate(BasePermission record);

    int insertOrUpdateSelective(BasePermission record);

    List<BasePermissionDTO> queryPermissionByRoleId(String id);

}
