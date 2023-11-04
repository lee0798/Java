package com.example.prac.project1;

public class Sedan extends Car{
    static int scount = 0;
    private int speed;
    private String no;
    private String color;
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
        System.out.printf(" people : %10s",this.cc);
        System.out.println();
    }


}

