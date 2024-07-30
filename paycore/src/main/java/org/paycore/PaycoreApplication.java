package org.paycore;

import org.paycore.configuration.ProductServiceProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ProductServiceProperties.class)
public class PaycoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(PaycoreApplication.class, args);
    }
}
