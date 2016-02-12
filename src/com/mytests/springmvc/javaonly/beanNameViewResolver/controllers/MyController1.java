package com.mytests.springmvc.javaonly.beanNameViewResolver.controllers;

import com.mytests.springmvc.javaonly.beanNameViewResolver.data.TesterDB;
import com.mytests.springmvc.javaonly.beanNameViewResolver.data.TesterList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/5/2016.
 * Project: havaonly_XMLViewResolvers
 * *******************************
 */
@Controller
public class MyController1 {


    @Autowired
    private TesterDB testerDB;

    @RequestMapping("/")
    public String getHome(Model model){
        model.addAttribute("title","Core QA Group orders for ");
        model.addAttribute("date",new Date());
        return "index";
    };

    @RequestMapping(method=RequestMethod.GET, value="/xml/testorders/")
    public ModelAndView getTrainsXml() {
        TesterList list = new TesterList(testerDB.getTesters());
        return new ModelAndView("testerOrderXmlView", "list", list);
    }

    @RequestMapping(method=RequestMethod.GET, value="/json/testorders/")
    public String getTrainsJson(Model modelArg) {
        TesterList list = new TesterList(testerDB.getTesters());
        modelArg.addAttribute("list",  list);
        return "testerOrderJsonView";
    }
}

