package com.example.beans;

public class vehicle {
    private String name;

    public static void printHello() {
        System.out.println("Printing Hallo from component vehicle bean");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
