package com.example.prac.chap5;

abstract public class PairMap {
    protected String[] keyArr;
    protected String[] valueArr;

    abstract String get(String key);

    abstract void put(String key, String value);

    abstract String delete(String key);
    abstract  int length();
}
