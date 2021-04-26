package com.example.laba1.threads;

import java.util.concurrent.TimeUnit;

public class NotificationThread implements Runnable {

    @Override
    public void run(){
        try {
            TimeUnit.SECONDS.sleep(10);
            System.out.println("Thread 1 finishes");
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
