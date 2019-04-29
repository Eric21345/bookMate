package cn.sbtp.controller.bookController;

import cn.sbtp.model.Book;
import cn.sbtp.service.bookService.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "getBookList", method = RequestMethod.POST)
    @SuppressWarnings("unchecked")
    public Map getBookList(){
        List<Book> bookList = bookService.getBookList();
        Map map = new HashMap();
        map.put("bookList", bookList);
        return map;
    }
}
