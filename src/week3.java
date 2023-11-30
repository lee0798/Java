package com.example.prac;


public class week3 {



    public static void cal(int x[][]){
        int line = x.length;
        int col = x[0].length;
        for(int i = 0 ; i < line - 1; i ++){
            for (int j = 0; j < col - 1; j++) {
                x[i][col - 1] += x[i][j];
                x[line][j] += x[i][j];
            }
        }


    }
    public static void main(String[] args) {

        int arr[][] = new int[4][5];
        int i = 1;
        for (int[] arrs : arr) {
            int j = 0;
            for (int s : arrs) {
                s = (i * 10) + j;
                System.out.print(s + " ");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println("===========");

        for (int arrs[] : arr) {
            for (int s : arrs) {
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
