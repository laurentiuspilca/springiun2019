package com.example.javaspringinge22;

import com.example.javaspringinge22.services.ScheduledService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ScheduledServiceTests {

    @Autowired
    private ScheduledService scheduledService;

    @Test
    public void contextLoads() {
        assertNotNull(scheduledService);
    }

    @Test
    public void isOddNumberWithOddParamProvided() {
        boolean res = scheduledService.isOddNumber(13);

        assertTrue(res);
    }

    @Test
    public void isOddNumberWithEvenParamProvided() {
        boolean res = scheduledService.isOddNumber(14);

        assertFalse(res);
    }
}

