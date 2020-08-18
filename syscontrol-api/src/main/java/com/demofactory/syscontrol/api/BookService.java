package com.demofactory.syscontrol.api;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demofactory.syscontrol.domain.Books;

import java.util.List;

public interface BookService extends IService<Books> {
    /**
     * 书本插入
     * @param books
     * @return
     */
    String insertBook(Books books);

    /**
     * 书本查找
     * @param books
     * @return
     */
    List<Books> selectBook(Books books);

    /**
     * 书本删除
     * @param books
     * @return
     */
    String deleteBook(Books books);
}
