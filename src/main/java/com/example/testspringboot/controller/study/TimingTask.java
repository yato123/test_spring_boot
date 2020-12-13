package com.example.testspringboot.controller.study;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

/**
 * @ClassName TimingTask
 * @Description: TODO
 * @Author 陈子龙
 * @Date 2020/11/30
 * @Version V1.0
 **/
@RestController
public class TimingTask {
    @Scheduled(cron = "0/2 * * * * ?")
    public void test(){
        System.out.println("定时器触发："+new Date());
    }
}
