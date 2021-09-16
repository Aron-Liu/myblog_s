package com.sinsoled.myblog.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.sinsoled.myblog.mapper.SysAccountMapper;
import com.sinsoled.myblog.model.SysAccount;
import com.sinsoled.myblog.service.SysAccountService;
@Service
public class SysAccountServiceImpl implements SysAccountService{

    @Resource
    private SysAccountMapper sysAccountMapper;

    @Override
    public int updateBatch(List<SysAccount> list) {
        return sysAccountMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<SysAccount> list) {
        return sysAccountMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<SysAccount> list) {
        return sysAccountMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(SysAccount record) {
        return sysAccountMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(SysAccount record) {
        return sysAccountMapper.insertOrUpdateSelective(record);
    }

}
