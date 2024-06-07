package com.async.controller;

import com.async.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {

    private final AsyncService asyncService;
    @Autowired
    public AsyncController(final AsyncService asyncService) {
        this.asyncService = asyncService;
    }
    @GetMapping("/run")
    public String run() throws InterruptedException {
        asyncService.executeA();
        asyncService.executeB();
        asyncService.executeC();
        asyncService.executeD();
        asyncService.executeE();
        return "Success";
    }
}
