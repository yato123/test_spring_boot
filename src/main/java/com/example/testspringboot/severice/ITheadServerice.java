package com.example.testspringboot.severice;

import com.example.testspringboot.entity.TheadDO;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName ITheadServerice
 * @Description: TODO
 * @Author 陈子龙
 * @Date 2020/12/1
 * @Version V1.0
 **/
public interface ITheadServerice {
    int insert(@Param("Thead") TheadDO theadDO);
    TheadDO seach(@Param ("Thead") TheadDO theadDO);
}
