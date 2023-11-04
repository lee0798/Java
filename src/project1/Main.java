package com.example.prac.project1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car[] arr = new Car[9];
        for(int i = 0 ; i < 9 ; i ++ ){
            switch (i){
                case 0:
                    arr[i] = new Sedan();
                    break;
                case 1 :
                case 2 :
                    arr[i] = new Sedan(100,"Black",3000);
                    break;
                case 3 :
                    arr[i] = new Bus();
                    break;
                case 4 :
                case 5 :
                    arr[i] = new Bus(30, "Red", 40);
                    break;
                case 6 :
                    arr[i] = new Truck();
                    break;
                case 7 :
                case 8 :
                    arr[i] = new Truck(20,"White", 3);
                    break;
            }

        }
        System.out.println("=====================================");
        System.out.println("Car 객체수 : "+ Car.count);
        System.out.println("Sedan 객체수 : " + Sedan.scount);
        System.out.println("Bus 객체수 : " + Bus.bcount);
        System.out.println("Truck 객체수 : " + Truck.tcount);
        System.out.println("=====================================");
        for(int i =0; i<9;i ++){
            System.out.print("[" + i +"] ");
            arr[i].carMember();
        }
        System.out.println("=====================================");
        arr[0].speedUp(20);
        arr[1].speedUp();
        arr[2].speedUp(150);
        arr[3].speedUp(20);
        arr[4].speedUp();
        arr[5].speedUp(100);
        arr[6].speedUp(20);
        arr[7].speedUp();
        arr[8].speedUp(70);
        for(int i =0; i<9;i ++){
            System.out.print("[" + i +"] ");
            arr[i].carMember();
        }
        System.out.println("=====================================");
        if(arr[4].comparedSpeed(arr[8]) == 1){
            System.out.println("인덱스 4번의 속도가 인덱스 8번의 속도보다 빠름");
        } else if (arr[4].comparedSpeed(arr[8]) == 0) {
            System.out.println("인덱스 4번의 속도와 인덱스 8번의 속도가 같음");
        }else {
            System.out.println("인덱스 4번의 속도가 인덱스 8번의 속도보다 느림");
        }
        System.out.println("=====================================");
        if(arr[1] instanceof Car){
            System.out.println("1 인덱스는 Car의 객체임");
        }else {
            System.out.println("1인덱스는 Car의 객체 아님");
        }
        if(arr[1] instanceof Sedan){
            System.out.println("1 인덱스는 Sedan의 객체임");
        }else {
            System.out.println("1인덱스는 Sedan의 객체 아님");
        }
        if(arr[4] instanceof Car){
            System.out.println("4 인덱스는 Car의 객체임");
        }else {
            System.out.println("4 인덱스는 Car의 객체 아님");
        }
        if(arr[4] instanceof Bus){
            System.out.println("4 인덱스는 Bus의 객체임");
        }else {
            System.out.println("4 인덱스는 Bus의 객체 아님");
        }
        if(arr[7] instanceof Car){
            System.out.println("7 인덱스는 Car의 객체임");
        }else {
            System.out.println("7 인덱스는 Car의 객체 아님");
        }
        if(arr[7] instanceof Truck){
            System.out.println("7 인덱스는 Truck의 객체임");
        }else {
            System.out.println("7 인덱스는 Truck의 객체 아님");
        }







    }

}
