package com.project.spring;

import java.util.Objects;

public class Test {

    public static class TestUtils {

        public String message;

        public void say() {
            if (Objects.isNull(message)) {
                System.out.println("Error");
            } else {
                System.out.println(message);
            }

        }

    }

    public static void main(String[] args) {

        TestUtils testUtils = new TestUtils();
        testUtils.message = "Test message";
        testUtils.say();

        TestUtils testUtils1 = new TestUtils();
        testUtils1.say();

    }

}
