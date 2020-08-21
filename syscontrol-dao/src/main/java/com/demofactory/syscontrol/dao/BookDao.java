package com.demofactory.syscontrol.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demofactory.syscontrol.domain.Books;
import org.springframework.stereotype.Repository;

/**
 * @author:Hanamaru
 * @description: TODO
 * @date: 2020/8/19 14:13
 */
@Repository
public interface BookDao extends BaseMapper<Books> {
}
