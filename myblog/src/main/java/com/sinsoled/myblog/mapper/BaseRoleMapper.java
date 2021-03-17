package com.sinsoled.myblog.mapper;

import com.sinsoled.myblog.dto.BasePermissionDTO;
import com.sinsoled.myblog.dto.BaseRoleDTO;
import com.sinsoled.myblog.model.BaseRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BaseRoleMapper {
    int updateBatch(List<BaseRole> list);

    int updateBatchSelective(List<BaseRole> list);

    int batchInsert(@Param("list") List<BaseRole> list);

    int insertOrUpdate(BaseRole record);

    int insertOrUpdateSelective(BaseRole record);


    List<BaseRoleDTO> queryRoleByUsername(String username);
}