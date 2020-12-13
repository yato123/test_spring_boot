package com.example.testspringboot.controller.study;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

/**
 * @ClassName ThreadTest
 * @Description: TODO
 * @Author 陈子龙
 * @Date 2020/11/28
 * @Version V1.0
 **/
@Slf4j
public class ThreadTest {

    static class MyThread implements Runnable{
        private String msg;

        public MyThread(String msg){
            this.msg = msg;
        }
        @Override
        public void run() {
            log.info("程式执行中=======》");
            try {
                if (msg.equals("ERROR")){
                    Thread.sleep(5000);
                    throw  new RuntimeException();
                }else {
                    log.info("{}",msg);
                    Thread.sleep(5000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 4, 60, TimeUnit.SECONDS,
            new ArrayBlockingQueue<Runnable>(200));



}

//    public static void main(String[] args) {
//        long stra = System.currentTimeMillis();
//        System.out.println(stra);
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2,4,60, TimeUnit.SECONDS,
//                new ArrayBlockingQueue<Runnable>(200));
//        ExecutorService executorService2 = Executors.newCachedThreadPool();{
//              class Mytask implements Runnable{
//                int i = 0;
//                public  Mytask(int i){
//                    this.i=i;
//                }
//                @Override
//                public void run() {
//                    System.out.println("我是线程：" + Thread.currentThread().getName() + "=====>" + i);
//                    try {
//                        Thread.sleep(1000);
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                }  }
//        for (int i = 0; i < 100; i++) {
//                synchronized ("") {
//                    threadPoolExecutor.execute(new Mytask(i));
//                }
//        }
//        threadPoolExecutor.shutdown();
//        long end = System.currentTimeMillis();
//        System.out.println(end-stra);


//    }
//    }


//static class MyThread implements Runnable{
//    private String msg;
//
//    public MyThread(String msg){
//        this.msg = msg;
//    }
//    @Override
//    public void run() {
//       log.info("程式执行中=======》");
//        try {
//            if (msg.equals("ERROR")){
//                Thread.sleep(5000);
//                throw  new RuntimeException();
//            }else {
//                log.info("{}",msg);
//                Thread.sleep(5000);
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//}
//
//    public static void main(String[] args) {
//        for (int i=0;i<3;i++) {
//           new Thread(new MyThread("任务进行")).start();
//        }
//        Thread thread = new Thread(new MyThread("ERROR"));
//        thread.start();
//        try {
//            thread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//    }

//}
