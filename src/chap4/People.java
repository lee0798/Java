package com.example.prac.chap4;

public class People {
    private String name;
    public People(String name){
        this.name = name;
        System.out.println("사람 객체 생성");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
