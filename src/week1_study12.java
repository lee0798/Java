package com.example.prac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;
@SpringBootApplication
public class week1_study12 {
    public static void main(String[] args) {
        SpringApplication.run(Week1Application.class, args);
        Scanner scanner = new Scanner(System.in);
        System.out.print("연산식 입력: ");
        String a = new String(scanner.nextLine());
        String[] arr;
        arr = a.split(" ");
        double b = 0;
        b = Double.parseDouble(arr[0]);
        double c = 0;
        c = Double.parseDouble(arr[2]);
        double d = 0;
        switch (arr[1]) {
            case "+":
                d = b + c;
                break;
            case "-":
                d = b - c;
                break;
            case "/":
                d = b / c;
                if(c == 0) {
                    System.out.println("0으로 나눌수 없습니다.");
                    System.exit(0);
                }
                break;
            case "*":
                d = b * c;
                break;
        }
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " = "+ d);
        scanner.close();
    }
}