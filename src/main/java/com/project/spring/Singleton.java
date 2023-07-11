package com.project.spring;

public class Singleton {

    private static Singleton instance;

    // Забороняємо створення екземплярів класу через оператор new
    private Singleton() {}

    private String string;

    // Перевіряємо, чи вже існує екземпляр класу, і повертаємо його
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Додаткові методи класу
    public void showMessage() {
        System.out.println("Привіт, я сінглтон!");
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "string='" + string + '\'' +
                '}';
    }
}
