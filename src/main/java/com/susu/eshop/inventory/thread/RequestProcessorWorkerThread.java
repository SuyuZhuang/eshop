package com.susu.eshop.inventory.thread;

import com.susu.eshop.inventory.request.Request;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;

/**
 * 执行请求的工作线程
 *
 * @author SuyuZhuang
 * @date 2020/6/14 11:15 下午
 */
public class RequestProcessorWorkerThread implements Callable<Boolean> {
    /**
     * 自己监控的内存队列
     */
    private ArrayBlockingQueue<Request> queue;

    public RequestProcessorWorkerThread(ArrayBlockingQueue<Request> queue) {
        this.queue = queue;
    }

    @Override
    public Boolean call() throws Exception {
        while (true) {
            break;
        }
        return true;
    }
}
