package com.example.prac.project1;

public class Sedan extends Car implements Sound{
    static int scount = 0;
    private int volume;
    private int cc;
    public Sedan(){
        super();//no만들기
        scount += 1;
        super.setNo("01-00"+scount);
    }
    public Sedan(int speed, String color, int cc){
        super(speed,color);//no 만들기
        scount += 1;
        super.setNo("01-00"+scount);
        this.cc = cc;
    }
    @Override
    public void soundUp() {
        this.volume +=12;
    }

    @Override
    public void soundDown() {
        if(this.volume -12 < 0){
            this.volume = 0;
        }else{
            this.volume -= 12;
        }
    }

    @Override
    public void speedUp() {
        if(super.getSpeed() + 10<= 200){
            super.speedUp();
        }else{
            super.setSpeed(200);
        }
    }

    @Override
    public void speedUp(int x) {
        if (super.getSpeed() + x <= 200) {
            super.speedUp(x);
        }else{
            super.setSpeed(200);
        }
    }

    @Override
    public void carMember() {
        super.carMember();
        System.out.printf(" cc : %10s volume :  %10d",this.cc,this.volume);
        System.out.println();
    }
}

