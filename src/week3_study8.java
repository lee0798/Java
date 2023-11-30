package com.example.prac;


import java.util.ArrayList;
import java.util.Scanner;

public class week3_study8 {
    public static boolean same(ArrayList<Integer> arr, int a) {
        for(int i = 0; i < arr.size(); i ++){
            if(a == arr.get(i)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if( num > 100 || num < 0){
            System.out.println("num 값을 0~100사이의 숫자로 입력해주세요");
            System.exit(0);
        }
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i =0 ; i < num ; i++){
            int a =(int)(Math.random() * 100) + 1;
            boolean isSame = same(arr, a);
            if(!isSame){
                arr.add(a);
                if((i+1) % 10 == 0 && i != 0){
                    System.out.printf("%3d",arr.get(i));
                    System.out.println();
                }else {
                    System.out.printf("%3d",arr.get(i));
                }
            }else {
                i --;
            }
        }
        scanner.close();
    }
}

