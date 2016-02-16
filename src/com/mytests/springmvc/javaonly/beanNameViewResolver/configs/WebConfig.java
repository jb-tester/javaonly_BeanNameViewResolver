package com.mytests.springmvc.javaonly.beanNameViewResolver.configs;

import com.mytests.springmvc.javaonly.beanNameViewResolver.controllers.MyController1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/5/2016.
 * Project: havaonly_BeanNameViewResolvers
 * Variant1: class extends WebMvcConfigurerAdapter,
 * view resolver is configured as @Bean-annotated method of ViewResolver type
 * *******************************
 */
/*@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = MyController1.class)
public class WebConfig extends WebMvcConfigurerAdapter
{

    @Bean
    public ViewResolver beanNameViewResolver() {
        BeanNameViewResolver viewResolver = new BeanNameViewResolver();
        viewResolver.setOrder(0);
        return viewResolver;
    }
   *//* @Bean
    public ViewResolver jspViewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setOrder(1);
        return viewResolver;
    }*//*

    // dummy view controllers - just to check support:
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/x1").setViewName("testerOrderJsonView");
        registry.addStatusController("/x2", HttpStatus.I_AM_A_TEAPOT);
        registry.addRedirectViewController("/x3","/x1");
    }
}*/
/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/5/2016.
 * Project: havaonly_BeanNameViewResolvers
 * Variant2: class extends WebMvcConfigurerAdapter,
 * view resolver is configured by configureViewResolvers() method overriding
 * *******************************
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = MyController1.class)
public class WebConfig extends WebMvcConfigurerAdapter
{


    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.beanName();
       // registry.jsp();
        super.configureViewResolvers(registry);
    }
// dummy view controllers - just to check support:
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/x1").setViewName("testerOrderJsonView");
        registry.addStatusController("/x2", HttpStatus.I_AM_A_TEAPOT);
        registry.addRedirectViewController("/x3","/x1");
        }

}
/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/5/2016.
 * Project: havaonly_BeanNameViewResolvers
 * Variant3: class extends WebMvcConfigurationSupport,
 * view resolver is configured by configureViewResolvers() method overriding
 * *******************************
 */

/*@Configuration
@ComponentScan(basePackageClasses = MyController1.class)
public class WebConfig extends WebMvcConfigurationSupport
{

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.beanName();
        registry.jsp();
        super.configureViewResolvers(registry);
    }

    // dummy view controllers - just to check support:
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/x1").setViewName("testerOrderJsonView");
        registry.addStatusController("/x2", HttpStatus.I_AM_A_TEAPOT);
        registry.addRedirectViewController("/x3", "/x1");
    }
}*/
