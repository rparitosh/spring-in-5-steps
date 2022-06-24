package com.paritosh.learning.springin5steps.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExternalPropertyService {
    @Value("${external.source.url}")
    private String serviceURL;

    public String getServiceURL() {
        return serviceURL;
    }
}
