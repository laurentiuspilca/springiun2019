package com.example.javaspringinge22.services;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ScheduledService {

    @Scheduled(cron = "* * * * * *")
    public void timer() {
        System.out.println(LocalDateTime.now());
    }

    public boolean isOddNumber(int x) {
        if (x % 2 != 0) return true;
        else return false;
    }
}
