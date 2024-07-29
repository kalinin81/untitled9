package org.paycore;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class PaycoreConfiguration {
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplateBuilder()
                .rootUri("localhost:8181/api/v1/product")
                .build();
    }
}
