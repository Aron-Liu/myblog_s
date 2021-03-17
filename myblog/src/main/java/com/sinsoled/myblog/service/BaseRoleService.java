package com.sinsoled.myblog.service;

import com.sinsoled.myblog.dto.BasePermissionDTO;
import com.sinsoled.myblog.model.BaseRole;

import java.util.List;

public interface BaseRoleService {


    int updateBatch(List<BaseRole> list);

    int updateBatchSelective(List<BaseRole> list);

    int batchInsert(List<BaseRole> list);

    int insertOrUpdate(BaseRole record);

    int insertOrUpdateSelective(BaseRole record);

    List<BasePermissionDTO> queryPermissionByRoleId(String id);
}
