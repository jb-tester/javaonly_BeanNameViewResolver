package com.mytests.springmvc.javaonly.beanNameViewResolver.data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


@XmlRootElement(name="testers")
public class TesterList {
    List<Tester> testers;

    public TesterList() {
    }

    public TesterList(List<Tester> testersArg) {
        testers = testersArg;
    }
    @XmlElement(name = "tester")
    public List<Tester> getTesters() {
        return testers;
    }

    public void setTesters(List<Tester> testersArg) {
        testers = testersArg;
    }
}
