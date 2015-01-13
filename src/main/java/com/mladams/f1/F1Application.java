package com.mladams.f1;

import com.mladams.f1.interceptor.BrandingInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class F1Application extends WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter {

    public static void main(String[] args) {
        SpringApplication.run(F1Application.class, args);
    }

    @Bean
    public BrandingInterceptor brandingInterceptor() {
        return new BrandingInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(brandingInterceptor());
    }
}
