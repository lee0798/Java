package com.example.prac.chap4;

public class Professor extends People {
    private String subject;
    Professor(String name ,String subject){
        super(name);
        this.subject = subject;
        System.out.println("교수객체생성");
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String pMember(){
        return "name : " + getName() + "subject : " + subject;
    }


}
