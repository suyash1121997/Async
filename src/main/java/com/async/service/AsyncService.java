package com.async.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Async
public class AsyncService {
    public void executeA() throws InterruptedException {
        Thread.sleep(10000);
        System.out.println("A"+Thread.currentThread().getName());
    }
    public void executeB() throws InterruptedException{
        Thread.sleep(10000);
        System.out.println("B"+Thread.currentThread().getName());
    }
    public void executeC() throws InterruptedException{
        System.out.println("C" + Thread.currentThread().getName());
    }

    public void executeD() throws InterruptedException{
        Thread.sleep(10000);

        System.out.println("D"+Thread.currentThread().getName());
    }
    public void executeE() throws InterruptedException{
        Thread.sleep(10000);
        System.out.println("E"+Thread.currentThread().getName());
    }


}
