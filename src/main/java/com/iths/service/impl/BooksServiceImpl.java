package com.iths.service.impl;

import com.iths.dao.IBooksDao;
import com.iths.pojo.Books;
import com.iths.service.IBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BooksServiceImpl implements IBooksService {
    @Autowired
    private IBooksDao booksDao;

    public int addBook(Books books) {

        return booksDao.addBook(books);
    }

    public int deleteBookById(int id) {
        return booksDao.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return booksDao.updateBook(books);
    }

    public Books queryBookById(int id) {
        return booksDao.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        System.out.println("booksDao-->"+booksDao);
        return booksDao.queryAllBook();
    }

    @Override
    public List<Books> queryBookName(String name) {
        return booksDao.queryBookName(name);
    }
}
