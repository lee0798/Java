package com.example.prac.chap5;

import java.sql.SQLOutput;

public class Dictionary extends PairMap{
    private int index;

    public Dictionary(int num){
        keyArr = new String[num];
        valueArr = new String[num];
        this.index = 0;
    }

    public String get(String key) {
        for(int i = 0; i < keyArr.length ; i ++){
            if (key.equals(keyArr[i])) {
                return valueArr[i];
            }
        }
        return "Key Error";
    }

    public void put(String key, String value) {
        for (int i = 0 ; i < keyArr.length ; i ++){
            if(key.equals(keyArr[i])){
                keyArr[i] = key;
                valueArr[i] = value;
                return;
            }
        }
        if(index == keyArr.length){
            System.out.println("배열크기 부족!!");
        }else{
            keyArr[index] = key;
            valueArr[index] = value;
            index++;
        }
    }

    public String delete(String key) {
        for (int i = 0; i < keyArr.length; i ++){
            if (key.equals(keyArr[i])){
                String s = valueArr[i];
                for (int j = i; j < keyArr.length-1; j ++){
                        keyArr[j] = keyArr[j + 1];
                        valueArr[j] = valueArr[j + 1];
                }
                keyArr[index-1] = null;
                valueArr[index - 1] = null;
                index--;
                return s;
            }
        }
        return "없음!!";
    }
    public int length() {
        return index;
    }
    public void dicPrint(){
        for(int i = 0 ; i < index; i++){
                System.out.printf("  %s : %10s", keyArr[i], valueArr[i]);
                System.out.println();
        }
    }
}
