package com.example.prac.project1;

public class Bus extends Car{
    static int bcount = 0;
    private int speed;
    private String no;
    private String color;
    private int people;
    public Bus(){
        super(); // no 만들기
        bcount += 1;
        super.setNo("01-00"+bcount);
    }
    public Bus(int speed, String color, int people){
        super(speed ,color);
        bcount += 1;
        super.setNo("01-00"+bcount);
        this.people = people;
    }

    @Override
    public void speedUp() {
        if(super.getSpeed() + 10 <= 100){
            super.speedUp();
        }else {super.setSpeed(100);}
    }

    @Override
    public void speedUp(int x) {
        if(super.getSpeed() + x <= 100){
            super.speedUp(x);
        }else {super.setSpeed(100);}
    }

    @Override
    public void carMember() {
        super.carMember();
        System.out.printf(" people : %10s",this.people);
        System.out.println();
    }
}
