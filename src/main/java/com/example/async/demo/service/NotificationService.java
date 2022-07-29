package com.example.async.demo.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class NotificationService {

    private void sleep(int nbSeconds) {
        try {
            TimeUnit.SECONDS.sleep(nbSeconds); //int->long
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Async
    public void sendMessage(String phoneNumber) {
        sleep(10);
        System.out.println("Call 3rd party service to send message [ThreadName=" + Thread.currentThread().getName() + "]");
    }

}
