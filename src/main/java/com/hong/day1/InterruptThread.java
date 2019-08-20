package com.hong.day1;

import com.hong.util.Util;
import org.junit.Test;

public class InterruptThread {

    public class MyThread extends Thread{
        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()){
                try {
                    System.out.println(currentThread().getName()+"-----"+isInterrupted());
                    Thread.sleep(10);
                }catch (Exception e){
                    System.out.println(currentThread().getName()+"-----"+isInterrupted());
                    e.printStackTrace();
                    interrupt();
                }
            }

            System.out.println(currentThread().getName()+"--11---"+isInterrupted());

        }
    }




    public static void main(String []args) throws InterruptedException {
        Thread thread=new InterruptThread().new MyThread();
        thread.start();
        Thread.sleep(100);
        thread.interrupt();
    }


}
