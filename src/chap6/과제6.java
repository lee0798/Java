package com.example.prac.chap6;

import java.util.Scanner;

public class 과제6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String s = sc.nextLine();
        StringBuffer sb = new StringBuffer(s);
        while(true) {
            System.out.print("명령 (종료:그만): ");
            String word = sc.next();
            if (word.equals("그만")){
                break;
            }
            String[] arr = word.split("!");

            if(arr.length != 2) {
                System.out.println("잘못 입력하셨습니다.");
            }
            else {
                if(arr[0].length() == 0 || arr[1].length() == 0) {
                    System.out.println("잘못 입력하셨습니다.");
                    continue;
                }
                int idx = sb.indexOf(arr[0]);
                if(idx == -1) { // not found!
                    System.out.println("찾을 수 없습니다!");
                    continue;
                }
                sb.replace(idx, idx+arr[0].length(), arr[1]);
                System.out.println(sb);
            }
        }
        sc.close();
    }

}

