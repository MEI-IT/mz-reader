package com.mz.reader.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mz.reader.entity.Category;
import com.mz.reader.mapper.CategoryMapper;
import com.mz.reader.service.CategoryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("categoryService")
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class CategoryServiceImpl implements CategoryService {
    @Resource
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> selectAll() {
        List<Category> list = categoryMapper.selectList(new QueryWrapper<Category>());
        return list;
    }
}
