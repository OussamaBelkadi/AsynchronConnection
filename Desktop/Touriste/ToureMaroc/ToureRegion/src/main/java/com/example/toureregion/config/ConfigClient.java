package com.example.toureregion.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@ConfigurationProperties(prefix = "global.params")
@RefreshScope()
@Getter @NoArgsConstructor @AllArgsConstructor
public class ConfigClient {
    private int a;
    private int b;

}
