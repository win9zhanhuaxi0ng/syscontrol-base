package com.demofactory.syscontrol.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demofactory.syscontrol.domain.UserBook;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserBookDao extends BaseMapper<UserBook> {
    List<Long> selectBookIdByUserId(Long userId);
}
