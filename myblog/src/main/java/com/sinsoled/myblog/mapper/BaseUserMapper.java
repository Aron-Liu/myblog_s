package com.sinsoled.myblog.mapper;

import com.sinsoled.myblog.dto.BaseRoleDTO;
import com.sinsoled.myblog.dto.LoginUser;
import com.sinsoled.myblog.model.BaseUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BaseUserMapper {
    int updateBatch(List<BaseUser> list);

    int updateBatchSelective(List<BaseUser> list);

    int batchInsert(@Param("list") List<BaseUser> list);

    int insertOrUpdate(BaseUser record);

    int insertOrUpdateSelective(BaseUser record);

    LoginUser getUserByUsername(String username);

}