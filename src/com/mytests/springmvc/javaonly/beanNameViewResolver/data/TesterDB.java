package com.mytests.springmvc.javaonly.beanNameViewResolver.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/9/2016.
 * Project: javaonly_BeanNameViewResolver
 * *******************************
 */
public class TesterDB {
    private static List<Tester> testers = new ArrayList<Tester>();


    static {
        testers.add(new Tester("Irina", "Petrovskaya",new Date(),"check the last fixes, test Spring"));
        testers.add(new Tester("Alexander", "Chernikov", new Date(),"test Kotlin"));
        testers.add(new Tester("Vika", "Dumova",new Date(),"test focus changes"));
        testers.add(new Tester("Daria", "Isachenkova",new Date(),"test git, smoke for mac"));
        testers.add(new Tester("Nikolay", "Sandalov",new Date(),"smoke for win8, linux"));
        testers.add(new Tester("Maria", "Vdovina", new Date(),"smoke for win7, check grails"));
        testers.add(new Tester("Maria", "Timofeeva",new Date(),"smoke for linux, database features"));
    }

    public static List<Tester> getTesters() {
        return testers;
    }
}
