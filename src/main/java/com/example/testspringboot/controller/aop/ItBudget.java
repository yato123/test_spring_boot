package com.example.testspringboot.controller.aop;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author 陈子龙
 * @Date 2020/11/14
 * @Version V1.0
 **/
public class ItBudget implements Budget {

    @Override
    public int count() {

        return   1500;
    }
}
