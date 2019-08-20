package com.hong.day1;

import org.junit.Test;

public class NewThread  extends Thread{

    @Override
    public void run() {
        System.out.println(currentThread().getId()+"------"+currentThread().getName());
    }

    @Test
    public void test() throws InterruptedException {
        for(int i=0;i<10;i++){
            Thread thread=new NewThread();
            thread.start();
            thread.join();
        }


    }



    public static void main(String[]args){
        for(int i=0;i<10;i++){
            new NewThread().start();
        }
    }




}
