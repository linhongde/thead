package com.hong.day1;

import org.junit.Test;

public class UseRunnable {



    @Test
    public void test(){
        Runnable runnable=new NewRunnable(10);
        for(int i=0;i<10;i++){
            Thread thread=new Thread(runnable);
            thread.start();
        }


    }

    public class NewRunnable implements Runnable{
        private int number;

        public NewRunnable(int number) {
            this.number = number;
        }

        public void run() {
            System.out.println(--number);
        }
    }
}
