package com.sinsoled.myblog.mapper;

import com.sinsoled.myblog.model.SysAccount;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysAccountMapper extends tk.mybatis.mapper.common.Mapper<SysAccount> {
    int updateBatch(List<SysAccount> list);

    int updateBatchSelective(List<SysAccount> list);

    int batchInsert(@Param("list") List<SysAccount> list);

    int insertOrUpdate(SysAccount record);

    int insertOrUpdateSelective(SysAccount record);
}