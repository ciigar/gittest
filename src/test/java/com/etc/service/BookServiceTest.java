package com.etc.service;

import com.etc.config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.swing.*;
import com.etc.entity.Book;
import java.util.List;

/**
 * @author Crayon
 * @ClassName BookServiceTest
 * @description
 * @date 2026/9/17 22:35
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {
    @Autowired
    private BookService bookService;

    @Test
    public void TestFindById() {
        Book book = bookService.findById(1);
        System.out.println(book);
    }

    @Test
    public void TestFindAll() {
        List<Book> all = bookService.findAll();
        System.out.println(all);
    }
}
