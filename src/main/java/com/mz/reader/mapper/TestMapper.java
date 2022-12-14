package com.mz.reader.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mz.reader.entity.Test;

public interface TestMapper extends BaseMapper<Test> {
    public void insertSample();
}
