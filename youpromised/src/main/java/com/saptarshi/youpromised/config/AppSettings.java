package com.saptarshi.youpromised.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;
import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "app.settings")
public class AppSettings implements Serializable {
    private Map<String, Boolean> features;

    // Getter and setter
    public Map<String, Boolean> getFeatures() {
        return features;
    }

    public void setFeatures(Map<String, Boolean> features) {
        this.features = features;
    }
}