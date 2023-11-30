package com.example.prac.project1;

public class Car {
    private int speed;
    private String no;
    private String color;
    public static int count = 0;

    public Car(){
        this.speed = 0;
        this.no = null;
        this.color = null;
        count += 1;
    }
    public Car(int speed, String color){
        this.speed = speed;
        this.no = null;
        this.color = color;
        count += 1;
    }
    public void setCar(Car car){
        this.speed = car.speed;
        this.color = car.color;
        this.no = car.no;
    }
    public void setNo(String no){
        this.no = no;
    }
    public int getSpeed(){
        return this.speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void speedUp(){
        this.speed += 10;
    }
    public void speedUp(int x){
        this.speed += x;
    }
    public void speedDown(){
        if(this.speed - 10 < 0){
            this.speed = 0;
        }else {
            this.speed -= 10;
        }
    }
    public void speedDown(int x){
        if(this.speed - x < 0){
            this.speed = 0;
        }else{
            this.speed -= x;
        }
    }
    public void carMember(){
        System.out.printf("speed : %3d no : %10s color : %10s",this.speed,this.no,this.color);
    }
    public int comparedSpeed(Car car){
        if(this.speed > car.speed){
            return 1;
        } else if (this.speed == car.speed) {
            return 0;
        }else {
            return -1;
        }
    }
    public boolean equals(Car car){
        if (this.color.equals(car.color) && this.speed == car.speed){
            return true;
        }else {
            return false;
        }
    }


}
