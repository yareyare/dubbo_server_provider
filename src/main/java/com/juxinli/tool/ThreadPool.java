package com.juxinli.tool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by admin on 2017/9/29.
 */
public class ThreadPool {

    public static int corePoolSize = 3;
    public static int maximumPoolSize =100;
    public static int QueueSize = 50;
    public static long keepAliveTime = 5L;

    private static class InnerInstance {
        public static ThreadPool instance = new ThreadPool();
    }

    public static ThreadPool getInstance() {
        return InnerInstance.instance;
    }

    public final static ThreadPoolExecutor POOL = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime,
            TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(QueueSize),
            new ThreadPoolExecutor.AbortPolicy());
}
