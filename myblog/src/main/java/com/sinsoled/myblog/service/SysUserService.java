package com.sinsoled.myblog.service;

import com.sinsoled.myblog.model.SysUser;
import java.util.List;
public interface SysUserService{


    int updateBatch(List<SysUser> list);

    int updateBatchSelective(List<SysUser> list);

    int batchInsert(List<SysUser> list);

    int insertOrUpdate(SysUser record);

    int insertOrUpdateSelective(SysUser record);

}
