package com.project.spring;

public class MainTest {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.setString("test");

        final Singleton instance = Singleton.getInstance();

        System.out.println(singleton);
        System.out.println(instance);
    }

}
