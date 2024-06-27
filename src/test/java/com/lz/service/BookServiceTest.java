package com.lz.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lz.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTest {
    @Autowired
    private IBookService iBookService;
    @Test
    void testGetById(){
        System.out.println(iBookService.getById(5));
    }
    @Test
    void testSave(){
        Book book=new Book();
        book.setType("测试数据123");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        iBookService.save(book);
    }
    @Test
    void testUpdate(){
        Book book=new Book();
        book.setId(8);
        book.setType("测试数据456");
        book.setName("测试数据456");
        book.setDescription("测试数据456");
        iBookService.updateById(book);
    }
    @Test
    void testDelete(){
        iBookService.removeById(16);
    }
    @Test
    void testGetAll(){
        iBookService.list();
    }
    @Test
    void testGetPage(){
        IPage<Book> page=new Page<>(2,5);
        iBookService.page(page);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(page.getRecords());
    }
}
