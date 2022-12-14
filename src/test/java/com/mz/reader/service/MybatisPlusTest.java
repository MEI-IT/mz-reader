package com.mz.reader.service;

import com.mz.reader.entity.Test;
import com.mz.reader.mapper.TestMapper;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springmvc.xml"})
public class MybatisPlusTest {

    @Resource
    private TestMapper testMapper;

    @org.junit.Test
    public void testInsert() {
        Test test = new Test();
        test.setContent("mybatis_puls测试");
        testMapper.insert(test);

    }
}
