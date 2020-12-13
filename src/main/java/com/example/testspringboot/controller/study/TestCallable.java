package com.example.testspringboot.controller.study;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @ClassName TestCallable
 * @Description: TODO
 * @Author 陈子龙
 * @Date 2020/11/24
 * @Version V1.0
 **/
@Slf4j
public class TestCallable {
//    public static void main(String[] args) {
//       log.info("我是主线程开始：===============>{}",Thread.currentThread().getName());
//        Callable<String> stringCallable = getCallable();
//        for (int i =10 ; i>0; i--){
//            new Thread(new FutureTask(stringCallable)).start();
//        }
//
//    }


    public static Callable<String> getCallable(){
        Callable<String> stringCallable = new Callable<String>(){
            @Override
            public String call() throws Exception {

                try {
                    log.info("线程为：{}",Thread.currentThread().getName());
                    log.info("尼玛终于开启多线程了,开始睡觉");
                    Thread.sleep(5000);
                    log.info("尼玛终于开启多线程了,开始睡醒了");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    log.info("我是子线程{}",Thread.currentThread().getName());
                    return "我是子线程：=============>"+Thread.currentThread().getName();
                }
            }
        };return stringCallable;
    }

    public static void main(String[] args) {

    }
}
