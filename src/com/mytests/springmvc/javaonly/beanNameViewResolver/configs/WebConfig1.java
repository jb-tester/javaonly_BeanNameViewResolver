package com.mytests.springmvc.javaonly.beanNameViewResolver.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/12/2016.
 * Project: javaonly_BeanNameViewResolver
 * *******************************
 */
@Configuration
//@EnableWebMvc
public class WebConfig1 extends WebMvcConfigurerAdapter {

   /* @Bean
    public ViewResolver jspViewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setOrder(1);
        return viewResolver;
    }*/
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp();
        super.configureViewResolvers(registry);
    }
}
