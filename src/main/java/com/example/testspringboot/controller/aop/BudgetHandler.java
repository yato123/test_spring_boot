package com.example.testspringboot.controller.aop;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName MyInvocationHandler
 * @Description: TODO
 * @Author 陈子龙
 * @Date 2020/11/14
 * @Version V1.0
 **/
@Slf4j
public class BudgetHandler implements InvocationHandler {

    //代理类中的真实对象
    private Budget budget;

    public BudgetHandler(){ }

    //JDK代理
    public BudgetHandler(Budget obj){
        this.budget = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info("Jdk代理方法之前=======>{}",method);
            Object returnValue  = method.invoke(budget, args);
        log.info("Jdk代理方法之后=======>{}",method);
            return returnValue ;
    }

}
