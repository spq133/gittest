package com.iths.dao;

import com.iths.pojo.Books;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IBooksDao {

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
