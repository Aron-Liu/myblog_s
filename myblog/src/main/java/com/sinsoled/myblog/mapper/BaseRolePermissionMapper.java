package com.sinsoled.myblog.mapper;

import com.sinsoled.myblog.model.BaseRolePermission;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BaseRolePermissionMapper {
    int updateBatch(List<BaseRolePermission> list);

    int updateBatchSelective(List<BaseRolePermission> list);

    int batchInsert(@Param("list") List<BaseRolePermission> list);

    int insertOrUpdate(BaseRolePermission record);

    int insertOrUpdateSelective(BaseRolePermission record);
}