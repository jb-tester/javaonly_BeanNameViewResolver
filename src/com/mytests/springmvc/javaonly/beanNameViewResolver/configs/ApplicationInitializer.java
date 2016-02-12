package com.mytests.springmvc.javaonly.beanNameViewResolver.configs;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * variant1: AbstractAnnotationConfigDispatcherServletInitializer extending
 */
public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class,WebConfig2.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
/**
 * variant2: WebApplicationInitializer extending
 */
/*
public class ApplicationInitializer implements WebApplicationInitializer
{
 
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException
    {
        WebApplicationContext context = getContext();
        servletContext.addListener(new ContextLoaderListener(context));
        ServletRegistration.Dynamic dispatcherServlet = servletContext.addServlet("DispatcherServlet", new DispatcherServlet(context));
        dispatcherServlet.setLoadOnStartup(1);
        dispatcherServlet.addMapping("/");
    }
     
    public AnnotationConfigWebApplicationContext getContext(){
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.setConfigLocation("com.mytests.springmvc.javaonly.beanNameViewResolver.configs");
        return context;
    }
 
}*/
