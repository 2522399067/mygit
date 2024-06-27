package com.lz.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lz.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookDaoTest {
    @Autowired
    private  BookDao bookDao;
    @Test
    void testGetById(){
        System.out.println(bookDao.selectById(1)) ;
    }
    @Test
    void testGetPage(){
        IPage page=new Page(1,5);
        bookDao.selectPage(page,null);
    }
    @Test
    void testGetBy(){
        QueryWrapper<Book> qw=new QueryWrapper<>();
        qw.like("name","Spring");
        bookDao.selectList(qw);
    }
     @Test
    void testGetBy2(){
        String name=null;
        LambdaQueryWrapper<Book> lqw=new LambdaQueryWrapper<>();
        lqw.like(name != null,Book::getName,"Spring");
        bookDao.selectList(lqw);
    }
}
