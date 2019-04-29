package cn.sbtp.service.bookService;

import cn.sbtp.mapper.BookMapper;
import cn.sbtp.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookMapper bookMapper;

    public List<Book> getBookList(){
        return bookMapper.getBookList();
    }
}
