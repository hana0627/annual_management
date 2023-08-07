package com.hana.annual.global.config;

import com.hana.annual.global.formatter.DateTypeFormatter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@Slf4j
public class WebConfig implements WebMvcConfigurer {



    /**
     * String -> LocalDateTime formatter
     */
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatter(new DateTypeFormatter());
    }

}