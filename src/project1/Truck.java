package com.example.prac.project1;

public class Truck extends Car{
    static int tcount = 0;
    private int speed;
    private String no;
    private String color;
    private int ton;
    public Truck(){
        super();//no만들기
        tcount += 1;
        super.setNo("03-00"+tcount);
    }

    public Truck(int speed, String color, int ton) {
        super(speed, color);
        tcount += 1;
        super.setNo("01-00"+tcount);
        this.ton = ton;
    }

    @Override
    public void speedUp() {
        if (super.getSpeed() + 10 <= 80) {
            super.speedUp();
        }else {super.setSpeed(80);}
    }

    @Override
    public void speedUp(int x) {
        if (super.getSpeed() + x <= 80) {
            super.speedUp(x);
        }else {super.setSpeed(80);}
    }

    @Override
    public void carMember() {
        super.carMember();
        System.out.printf(" people : %10d",this.ton);
        System.out.println();
    }
}
