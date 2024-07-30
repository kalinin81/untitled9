package org.paycore.configuration;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "product")
@RequiredArgsConstructor
@Getter
public class ProductServiceProperties {
    private final String host;
    private final String path;
    private final String productsByAccountUrl;
    private final String productsByProductIdUrl;

}
