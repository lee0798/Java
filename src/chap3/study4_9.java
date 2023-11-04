package com.example.prac.chap3;
class ArrayUtil{
    public static int[] concat(int[] a, int[] b){
        int[] arr = new int[a.length + b.length];
        for(int i = 0; i < a.length ; i ++){
            arr[i] = a[i];
        }
        for(int i = 0; i < b.length; i ++){
            arr[a.length + i] = b[i];
        }
        return arr;
    }
    public static void print(int[] a){
        for (int i = 0; i < a.length; i ++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
public class study4_9 {
    public static void main(String[] args) {
        int[] arr1 = {1,5,7,9};
        int[] arr2 = {3,-6,-1,100,77};
        int[] arr = ArrayUtil.concat(arr1 , arr2);
        ArrayUtil.print(arr1);
        ArrayUtil.print(arr2);
        ArrayUtil.print(arr);

    }
}
