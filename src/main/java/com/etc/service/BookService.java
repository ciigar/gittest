package com.etc.service;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.etc.entity.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Crayon
 * @ClassName BookService
 * @description
 * @date 2026/9/17 22:09
 */

@Transactional
public interface BookService {

    /**
     * 保存
     * @param book
     * @return
     */
    public boolean save(Book book);

    /**
     * 修改
     * @param book
     * @return
     */
    public boolean update(Book book);

    /**
     * 删除
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    public Book findById(Integer id);

    /**
     * 查询全部
     * @return
     */
    public List<Book> findAll();
}
