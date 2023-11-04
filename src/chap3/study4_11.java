package com.example.prac.chap3;

import java.util.Scanner;

class Add{

    int a;
    int b;
    void setValue(int a, int b){
        this.a = a;
        this.b = b;
    }
    int calculate(){
        return this.a+this.b;
    }
}
class Div{
    int a;
    int b;
    void setValue(int a, int b){
        this.a = a;
        this.b = b;
    }
    int calculate(){
        return this.a/this.b;
    }
}
class Sub{
    int a;
    int b;
    void setValue(int a, int b){
        this.a = a;
        this.b = b;
    }
    int calculate(){
        return this.a-this.b;
    }
}
class Mul{
    int a;
    int b;
    void setValue(int a, int b){
        this.a = a;
        this.b = b;
    }
    int calculate(){
        return this.a*this.b;
    }
}



public class study4_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("정수 정수 연산자 입력: ");
        int x = in.nextInt();
        int y = in.nextInt();
        String z = in.next();
        int result = 0;
        switch (z) {
            case "+":
                Add test = new Add();
                test.setValue(x,y);
                result = test.calculate();
                break;
            case "-":
                Sub test2 = new Sub();
                test2.setValue(x,y);
                result = test2.calculate();
                break;
            case "/":
                Div test3 = new Div();
                test3.setValue(x,y);
                result = test3.calculate();
                break;
            case "*":
                Mul test4 = new Mul();
                test4.setValue(x,y);
                result = test4.calculate();
                break;
        }
        System.out.println(x+z+y+"="+result);


    }
}
