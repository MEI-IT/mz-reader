package com.mz.reader.service.impl;

import com.mz.reader.service.MemberService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:springmvc.xml"})
public class MemberServiceImplTest {

    @Resource
    private MemberService memberService;

   public void createMember() {
       memberService.createMember("s123456", "123456", "测试");
 }
}