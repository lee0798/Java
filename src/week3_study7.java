package com.example.prac;

public class week3_study7 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        int sum = 0;
        System.out.print("랜덤한 정수들 : ");
        for(int i = 0; i < 10; i++){
            arr[i] = (int)(Math.random()*10 + 1);
            System.out.print(arr[i]+" ");
            sum += arr[i];
        }
        System.out.println();
        double aver = 0 ;
        aver = Double.valueOf(sum);
        System.out.printf("평균 : %.1f", aver/10);
    }
}