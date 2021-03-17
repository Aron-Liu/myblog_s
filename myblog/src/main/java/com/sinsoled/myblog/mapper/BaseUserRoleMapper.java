package com.sinsoled.myblog.mapper;

import com.sinsoled.myblog.model.BaseUserRole;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BaseUserRoleMapper {
    int updateBatch(List<BaseUserRole> list);

    int updateBatchSelective(List<BaseUserRole> list);

    int batchInsert(@Param("list") List<BaseUserRole> list);

    int insertOrUpdate(BaseUserRole record);

    int insertOrUpdateSelective(BaseUserRole record);
}