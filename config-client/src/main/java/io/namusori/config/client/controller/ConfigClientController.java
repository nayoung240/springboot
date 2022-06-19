package io.namusori.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${namoosori.value}") // configtest-dev.yml
    private String configStr;

    @GetMapping("/test")
    public String test() {
        return configStr;
    }
}
