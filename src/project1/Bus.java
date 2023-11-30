package com.example.prac.project1;

public class Bus extends Car implements Sound{
    private int volume;
    static int bcount = 0;
    private int people;
    public Bus(){
        super(); // no 만들기
        bcount += 1;
        super.setNo("02-00"+bcount);
    }
    public Bus(int speed, String color, int people){
        super(speed ,color);
        bcount += 1;
        super.setNo("02-00"+bcount);
        this.people = people;
    }
    @Override
    public void soundUp() {
        this.volume +=6;
    }

    @Override
    public void soundDown() {
        if(this.volume -6 < 0){
            this.volume = 0;
        }else{
            this.volume -= 6;
        }
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
        System.out.printf(" people : %6s volume :  %10d",this.people,this.volume);
        System.out.println();
    }
}
