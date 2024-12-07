package com.studentworkshop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {

    @Bean
    WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**")
                        .allowedOrigins("http://localhost:3000", "https://online-workshop-nine.vercel.app")
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")  // Allow OPTIONS method
                        .allowedHeaders("*")
                        .allowCredentials(true);  // Add this if your requests require credentials (like cookies or tokens)
            }
        };
    }
}

