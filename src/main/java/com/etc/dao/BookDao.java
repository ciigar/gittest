package com.etc.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.etc.entity.Book;
import java.util.List;

/**
 * @author Crayon
 * @ClassName BookService
 * @description
 * @date 2026/9/17 22:09
 */

public interface BookDao {

    @Insert("insert into tb_book values (null,#{type},#{name},#{description})")
    public int save(Book book);
    @Update("update tb_book set type = #{type}, name = #{name}, description = #{description} where id = #{id}")
    public int update(Book book);
    @Delete("delete from tb_book where id = #{id}")
    public int delete(Integer id);
    @Select("select * from tb_book where id = #{id}")
    public Book findById(Integer id);
    @Select("select * from tb_book")
    public List<Book> findAll();
}
