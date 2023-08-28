package com.example.dev.java8.predicate;

public class SoftwareEngineer {

    private String name;
    private int age;
    private boolean isHavingGF;

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

    public boolean isHavingGF() {
        return isHavingGF;
    }

    public void setHavingGF(boolean havingGF) {
        isHavingGF = havingGF;
    }

    public SoftwareEngineer(String name, int age, boolean isHavingGF) {
        this.name = name;
        this.age = age;
        this.isHavingGF = isHavingGF;
    }

    @Override
    public String toString() {
        return name;
    }
}
