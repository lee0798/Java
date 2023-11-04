package com.example.prac.chap4;

public class Main {
    public static void main(String[] args) {

        People[] p = new People[2];
        p[0] = new Student("이도환", 90);
        p[1] = new Professor("dltks", "프로그램");
        Student s = (Student) p[0];
        Professor pro = (Professor) p[1];

        System.out.println(pro.pMember());
        System.out.println(s.sMember());
    }
}
