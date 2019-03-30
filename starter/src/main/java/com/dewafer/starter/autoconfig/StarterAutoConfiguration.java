package com.dewafer.starter.autoconfig;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class StarterAutoConfiguration {

    @Bean
    public InitializingBean starterInitializingBean() {
        return () -> log.info("starter bean initializing...");
    }
}
