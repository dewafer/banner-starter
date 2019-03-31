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
        return () -> log.info("Initializing Banana...\n\n" +
                " ____                                 /\\/\\   ___       _ _   _       _ _             _   \n" +
                "| __ )  __ _ _ __   __ _ _ __   __ _  >  <  |_ _|_ __ (_) |_(_) __ _| (_)_______  __| |  \n" +
                "|  _ \\ / _` | '_ \\ / _` | '_ \\ / _` |_\\/\\ |  | || '_ \\| | __| |/ _` | | |_  / _ \\/ _` |  \n" +
                "| |_) | (_| | | | | (_| | | | | (_| / __` |  | || | | | | |_| | (_| | | |/ /  __/ (_| |_ \n" +
                "|____/ \\__,_|_| |_|\\__,_|_| |_|\\__,_\\____/  |___|_| |_|_|\\__|_|\\__,_|_|_/___\\___|\\__,_(_)\n" +
                "\n");
    }
}
