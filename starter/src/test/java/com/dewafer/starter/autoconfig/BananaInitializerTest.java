package com.dewafer.starter.autoconfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class BananaInitializerTest {

    @InjectMocks
    StarterAutoConfiguration autoConfiguration;


    @Test
    public void printBanana() throws Exception {
        autoConfiguration.starterInitializingBean().afterPropertiesSet();
    }

}