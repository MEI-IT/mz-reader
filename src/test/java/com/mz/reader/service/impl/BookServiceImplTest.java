package com.mz.reader.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.mz.reader.entity.Book;
import com.mz.reader.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springmvc.xml"})
public class BookServiceImplTest {

    @Resource
    private BookService bookService;

    @Test
    public void paging() {
        IPage<Book> paging = bookService.paging(2l,"quantity",1, 10);
        List<Book> records = paging.getRecords();
        for (Book b :
                records) {
            System.out.println(b.getBookId() + ":" + b.getBookName());
        }
        System.out.println("总页数"+paging.getPages());
        System.out.println("总记录数："+ paging.getTotal());
    }

}