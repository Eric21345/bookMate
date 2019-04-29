package cn.sbtp.mapper;


import cn.sbtp.model.Book;

import java.util.List;

public interface BookMapper {

    //增加书籍
    void addBookInfo();
    //获取图书列表
    List<Book> getBookList();
}
