package com.mytests.springmvc.javaonly.beanNameViewResolver.configs;

import com.mytests.springmvc.javaonly.beanNameViewResolver.data.Tester;
import com.mytests.springmvc.javaonly.beanNameViewResolver.data.TesterDB;
import com.mytests.springmvc.javaonly.beanNameViewResolver.data.TesterList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
import org.springframework.web.servlet.view.xml.MarshallingView;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/9/2016.
 * Project: javaonly_BeanNameViewResolver
 * *******************************
 */
@Configuration
public class WebConfig2 {
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller _jaxb2Marshaller_ = new Jaxb2Marshaller();
        _jaxb2Marshaller_.setClassesToBeBound(Tester.class, TesterList.class);
        return _jaxb2Marshaller_;
    }

    @Bean
    public MarshallingView testerOrderXmlView() {
        return new MarshallingView(marshaller());
    }

    @Bean
    public MappingJackson2JsonView testerOrderJsonView() {
        return new MappingJackson2JsonView();
    }
    @Bean
    public TesterDB db() {
        return new TesterDB();
    }

}
