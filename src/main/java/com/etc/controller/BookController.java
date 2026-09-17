package com.etc.controller;

import com.etc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.etc.entity.Book;
import java.util.List;

/**
 * @author Crayon
 * @ClassName BookController
 * @description
 * @date 2026/9/17 22:11
 */

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public boolean save(@RequestBody Book book) {
        bookService.save(book);
        return true;
    }

    @PutMapping
    public boolean update(@RequestBody Book book) {
        bookService.update(book);
        return true;
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
        bookService.delete(id);
        return true;
    }

    @GetMapping("/{id}")
    public Book findById(@PathVariable Integer id) {
        return bookService.findById(id);
    }

    @GetMapping
    public List<Book> findAll() {
        return bookService.findAll();
    }
}
