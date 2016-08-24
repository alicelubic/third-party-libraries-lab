package com.example.owlslubic.databindinglab;

/**
 * Created by owlslubic on 8/24/16.
 */
public class Dog {

    private String name, breed, color;
    private int age;
    private boolean isNice;

    public Dog(String name, String breed, String color, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.isNice = isNice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isNice() {
        return isNice;
    }

    public void setNice(boolean nice) {
        isNice = nice;
    }
}
