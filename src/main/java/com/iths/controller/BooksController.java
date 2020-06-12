package com.iths.controller;


import com.iths.pojo.Books;
import com.iths.service.IBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BooksController {

    @Autowired
    @Qualifier("booksServiceImpl")
    private IBooksService booksService;

    @RequestMapping("/allBook")
    public String allBook(Model model){
        System.out.println(booksService);
        List<Books> list = booksService.queryAllBook();
        for (Books books : list) {
            System.out.println(books);
        }
        model.addAttribute("list",list);
        return "allBook";
    }
    //跳转增加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddBook(){
        return "addBook";
    }

    //添加书籍请求
    @RequestMapping("/addBook")
    public String addBook(Books books){
        booksService.addBook(books);
        return "redirect:/book/allBook";
    }

    //跳转到修改书籍页面
    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(int id,Model model){
        Books books = booksService.queryBookById(id);
        model.addAttribute("books",books);
        return "insert";
    }

    //修改书籍请求
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        booksService.updateBook(books);
        return "redirect:/book/allBook";
    }

    //删除书籍请求
    @RequestMapping("/deleteBook")
    public String deleteBook(int id){
        booksService.deleteBookById(id);
        return "redirect:/book/allBook";
    }
    //模糊搜索请求
    @RequestMapping("/queryBook")
    public String  queryBook(String queryBookName,Model model){
        if (queryBookName == null || queryBookName.length()==0){
            model.addAttribute("warning","亲，没有此书籍！");
        }
        queryBookName = "%"+queryBookName+"%";
        List<Books> books = booksService.queryBookName(queryBookName);
        for (Books book : books) {
            System.out.println("------>"+book);
        }
        if (books.size() == 0){
            model.addAttribute("warn","亲，没有此书籍！");
        }

        model.addAttribute("list",books);
        return "allBook";

    }

}
