package com.example.async.demo.config;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

@Component
public class AsyncExceptionHandler implements AsyncUncaughtExceptionHandler {

    @Override
    public void handleUncaughtException(Throwable ex, Method method, Object... params) {
        StringBuilder sb = new StringBuilder();
        sb.append("Method name: " + method.getName());
        sb.append(" ---- ");
        sb.append(Arrays.toString(params));
        sb.append(" ---- ");
        sb.append("Error Message: " + ex.getMessage());
        System.out.println(sb.toString());
    }

}
