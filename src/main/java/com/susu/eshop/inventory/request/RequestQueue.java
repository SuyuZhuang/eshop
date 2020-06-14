package com.susu.eshop.inventory.request;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * 请求的内存队列
 *
 * @author SuyuZhuang
 * @date 2020/6/14 11:20 下午
 */
public class RequestQueue {
    private List<ArrayBlockingQueue<Request>> queues = new ArrayList<>();

    public void addQueue(ArrayBlockingQueue<Request> queue) {
        queues.add(queue);
    }

    private static class Singleton {
        private static RequestQueue instance;

        static {
            instance = new RequestQueue();
        }

        public static RequestQueue getInstance() {
            return instance;
        }
    }

    /**
     * jvm的机制去保证多线程并发安全
     * 内部类的初始化，一定只会发生一次，不管多少个线程并发去初始化
     */
    public static RequestQueue getInstance() {
        return Singleton.getInstance();
    }


}
