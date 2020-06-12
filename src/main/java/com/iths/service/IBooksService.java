package com.iths.service;

import com.iths.pojo.Books;

import java.util.List;

public interface  IBooksService {
    //增加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBookById(int id);

    //更新一个本书
    int updateBook(Books books);

    //查询一本书
    Books queryBookById(int id);

    //查询所有书
    List<Books> queryAllBook();
    //模糊查询
    List<Books> queryBookName(String name);
}
