package com.example.prac.project1;

public class Truck extends Car implements Sound{
    private int volume;
    static int tcount = 0;
    private int ton;
    public Truck(){
        super();
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
    public void soundUp() {
        this.volume +=8;
    }

    @Override
    public void soundDown() {
        if(this.volume -8 < 0){
            this.volume = 0;
        }else{
            this.volume -= 8;
        }
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
        System.out.printf(" ton : %10d volume :  %9d",this.ton,this.volume);
        System.out.println();
    }
}
