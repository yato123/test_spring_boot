package com.example.testspringboot.Dao;

import com.example.testspringboot.entity.TheadDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TheadDao {

    int insert(@Param("Thead")TheadDO theadDO);

    TheadDO seach(@Param ("Thead") TheadDO theadDO);
}
