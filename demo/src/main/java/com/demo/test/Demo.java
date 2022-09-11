package com.demo.test;

import com.demo.controller.UserController;
import com.demo.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @Description
 * @Date: 2022/9/4 16:47
 */
public class Demo {
    @Test//xml装配
    public void XmlDemo(){
        String xmlPath = "application.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println(applicationContext.getBean("XM"));
        System.out.println(applicationContext.getBean("ZS"));
        System.out.println(applicationContext.getBean("SH"));
    }
    @Test
    public void annotationDemo() {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/application_annotation.xml");
        UserController userController = (UserController) context.getBean("userController");
        userController.save();
    }

}
