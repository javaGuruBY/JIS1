package com.vladis1350.configuration;

import com.vladis1350.bean.UniqueWordCounter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringConfig {

    @Bean
    public UniqueWordCounter uniqueWordCounter() {
        return new UniqueWordCounter();
    }
}
