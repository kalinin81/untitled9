package org.paycore.configuration;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@RequiredArgsConstructor
public class PaycoreConfiguration {

    private final ProductServiceProperties productServiceProperties;

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplateBuilder()
                .rootUri(productServiceProperties.getHost() + productServiceProperties.getPath())
                .build();
    }
}
