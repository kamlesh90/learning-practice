package com.example.cac.autoconfig;

import com.example.cac.api.JsonLog;
import com.example.cac.api.LogApi;
import com.example.cac.api.XmlLog;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(LogApi.class)
public class LogGenAutoConfiguration {
    @Bean
    @ConditionalOnMissingBean
    public JsonLog jsonLog(){
        return new JsonLog();
    }
    @Bean
    @ConditionalOnBean
    public XmlLog xmlLog(){
        return new XmlLog();
    }
}
