package com.mz.reader.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mz.reader.entity.Book;

public interface BookMapper extends BaseMapper<Book> {

    public void updateEvaluation();
}
