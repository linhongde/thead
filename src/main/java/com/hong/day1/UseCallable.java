package com.hong.day1;

import org.junit.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;

public class UseCallable {

    @Test
    public void test() throws ExecutionException, InterruptedException {
        FutureTask future=new FutureTask(new NewCallable());
        new Thread(future).start();
        System.out.println(future.get());

    }





    public class NewCallable implements Callable<Integer>{
        public Integer call() throws Exception {
            return 10;
        }
    }





}
