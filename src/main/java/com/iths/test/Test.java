package com.iths.test;

import com.iths.dao.IBooksDao;
import com.iths.pojo.Books;
import com.iths.service.IBooksService;
import com.iths.service.impl.BooksServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        ApplicationContext cpxac = new ClassPathXmlApplicationContext("spring-dao.xml");
         IBooksService booksServiceImpl = (BooksServiceImpl)cpxac.getBean("booksServiceImpl");
         IBooksDao booksDao = (IBooksDao)cpxac.getBean("IBooksDao");
        System.out.println(booksServiceImpl);
        System.out.println(booksDao);

    }
}
