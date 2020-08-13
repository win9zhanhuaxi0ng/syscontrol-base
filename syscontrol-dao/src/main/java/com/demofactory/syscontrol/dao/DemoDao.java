package com.demofactory.syscontrol.dao;

import com.demofactory.syscontrol.domain.Demo;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoDao {

    public int insert(Demo demo);
}
