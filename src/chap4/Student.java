package com.example.prac.chap4;

public class Student extends People{
    private int score;
    public Student(String name, int score){
        super(name);
        this.score = score;
        System.out.println(" 학생 객체 생성");
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public String sMember(){
        return "name : " + getName() + "score : " + score;
    }


}
