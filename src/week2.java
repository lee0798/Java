package com.example.prac;


public class week2 {
    public static void main(String[] args) {

        int[] n = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int k : n) {
            System.out.print(k+1 + " ");
            sum += (k + 1);
        }
        System.out.println("합: "+ sum);


    }

}
