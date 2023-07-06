package com.project.spring.task2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");
        TestBean testBean = context.getBean("testBean", TestBean.class);
        testBean.setCity("Big");
        System.out.println(testBean.getCity());
        System.out.println(testBean.getName());

        TestBean testBean1 = context.getBean("testBean", TestBean.class);
        System.out.println(testBean1.getCity());
        System.out.println(testBean1.getName());

        context.close();
    }
}
