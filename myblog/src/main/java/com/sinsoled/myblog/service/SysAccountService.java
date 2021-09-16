package com.sinsoled.myblog.service;

import java.util.List;
import com.sinsoled.myblog.model.SysAccount;
public interface SysAccountService{


    int updateBatch(List<SysAccount> list);

    int updateBatchSelective(List<SysAccount> list);

    int batchInsert(List<SysAccount> list);

    int insertOrUpdate(SysAccount record);

    int insertOrUpdateSelective(SysAccount record);

}
