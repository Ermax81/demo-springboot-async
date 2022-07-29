package com.example.async.demo.controller;

import com.example.async.demo.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    // TO TEST: http://localhost:8080/send?phone=1234
    @GetMapping("/send")
    @ResponseBody
    public String sendMessage(@RequestParam String phone) {
        notificationService.sendMessage(phone);
        return "Message sent successfully [ThreadName:" + Thread.currentThread().getName() + "]";
    }

}
