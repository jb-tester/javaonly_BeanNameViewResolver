package com.mytests.springmvc.javaonly.beanNameViewResolver.data;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * by Irina.Petrovskaya, on 13.11.12, 18:53
 */
@XmlRootElement(name="testers")
public class Tester {
    private String firstname;
        private String lastname;
    private Date releaseDate;
    private String order;

    @JsonSerialize(using = CustomDateSerializer.class)
    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDateArg) {
        releaseDate = releaseDateArg;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String orderArg) {
        order = orderArg;
    }

    public Tester() {
        }

    public Tester(String firstnameArg, String lastnameArg, Date releaseDateArg, String orderArg) {
        firstname = firstnameArg;
        lastname = lastnameArg;
        releaseDate = releaseDateArg;
        order = orderArg;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
