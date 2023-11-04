package com.example.prac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;
@SpringBootApplication
public class week1_study3 {
    public static void main(String[] args) {
        SpringApplication.run(Week1Application.class, args);
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b;
        System.out.println("금액 입력:" +a);
        System.out.println("오만원: "+a/50000);
        b = a % 50000;
        System.out.println("만원: "+b/10000);
        b = b % 10000;
        System.out.println("오천원: "+b/5000);
        b = b % 5000;
        System.out.println("천원: "+b/1000);
        b = b % 1000;
        System.out.println("500원: "+b/500);
        b = b % 500;
        System.out.println("100원: "+b/100);
        b = b % 100;
        System.out.println("50원: "+b/50);
        b = b % 50;
        System.out.println("10원: "+b/10);
        b = b % 10;
        System.out.println("1원: "+b);
        scanner.close();

    }

}