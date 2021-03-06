package com.demofactory.syscontrol.api;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demofactory.syscontrol.common.ObjResult;
import com.demofactory.syscontrol.common.Result;
import com.demofactory.syscontrol.domain.Books;

import java.util.List;

/**
 * @author:Hanamaru
 * @description: TODO
 * @date: 2020/8/20 13:46
 */
public interface BookService extends IService<Books>
{
    /**
     * 书本插入 book_name domain_id
     *
     * @param books
     * @return
     */
    ObjResult<String> insertBook(Books books);

    /**
     * 书本查找 book_name domain_id
     *
     * @param books
     * @return
     */
    ObjResult<List<Books>> selectBook(Books books);

    /**
     * 书本删除 book_name domain_id
     *
     * @param id
     * @return
     */
    ObjResult<String> deleteBook(Long id);
}
