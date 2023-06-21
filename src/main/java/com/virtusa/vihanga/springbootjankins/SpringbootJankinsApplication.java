package com.virtusa.vihanga.springbootjankins;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@Slf4j
public class SpringbootJankinsApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        log.info(".......................Start Vihanga App............................ ");
        SpringApplication.run(SpringbootJankinsApplication.class, args);
        log.info(".......................After Vihanga App............................. ");
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootJankinsApplication.class);
    }

}
