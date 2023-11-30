package com.example.prac.project1;

abstract public class Electronic implements Sound {
    String type;
    int volume;

    @Override
    public void soundUp(){
    }
    @Override
    public void soundDown(){
    }
    public abstract String eleMember();
}
