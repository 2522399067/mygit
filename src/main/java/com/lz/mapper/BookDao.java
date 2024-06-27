package com.lz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lz.domain.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookDao extends BaseMapper<Book> {

}
