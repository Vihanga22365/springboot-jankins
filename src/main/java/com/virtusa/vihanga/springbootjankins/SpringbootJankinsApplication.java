package com.virtusa.vihanga.springbootjankins;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringbootJankinsApplication {

    public static void main(String[] args) {
        log.info(".......................Start Vihanga App............................ ");
        SpringApplication.run(SpringbootJankinsApplication.class, args);
        log.info(".......................After Vihanga App............................. ");
    }

}
