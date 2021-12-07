package com.phoenix.demos;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class WebConfig {
    @Bean
    public ViewResolver getView()
    {
        InternalResourceViewResolver view = new InternalResourceViewResolver();
        view.setPrefix("/");
        view.setSuffix(".jsp");
        return view;
    }

}
