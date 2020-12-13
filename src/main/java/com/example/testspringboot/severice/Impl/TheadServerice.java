package com.example.testspringboot.severice.Impl;

import com.example.testspringboot.entity.TheadDO;
import com.example.testspringboot.severice.ITheadServerice;
import org.springframework.stereotype.Service;

/**
 * @ClassName ITheadServerice
 * @Description: TODO
 * @Author 陈子龙
 * @Date 2020/12/1
 * @Version V1.0
 **/
@Service
public class TheadServerice implements ITheadServerice {
    @Override
    public int insert(TheadDO theadDO) {
        return 0;
    }

    @Override
    public TheadDO seach(TheadDO theadDO) {
        return null;
    }
}
