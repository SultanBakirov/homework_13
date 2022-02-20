package com.company;

public class Fish {
    private String name;
    private int age;
    private String color;

    public void swim() {
        System.out.println("Fish lives in the water");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
