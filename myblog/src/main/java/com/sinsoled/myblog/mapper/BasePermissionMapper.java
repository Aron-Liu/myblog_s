package com.sinsoled.myblog.mapper;

import com.sinsoled.myblog.dto.BasePermissionDTO;
import com.sinsoled.myblog.model.BasePermission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BasePermissionMapper extends tk.mybatis.mapper.common.Mapper<BasePermission> {
    int updateBatch(List<BasePermission> list);

    int updateBatchSelective(List<BasePermission> list);

    int batchInsert(@Param("list") List<BasePermission> list);

    int insertOrUpdate(BasePermission record);

    int insertOrUpdateSelective(BasePermission record);

    List<BasePermissionDTO> queryPermissionByRoleId(String id);
}