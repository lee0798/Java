package com.example.prac.project1;

public class Radio extends Electronic{
    int price;
    public Radio(){
        this.volume = 0;
        this.type = "audio";
        this.price = 10000;
    }

    @Override
    public void soundUp() {
        super.soundUp();
        this.volume +=5;
    }

    @Override
    public void soundDown() {
        super.soundDown();
        if(this.volume -5 < 0){
            this.volume = 0;
        }else{
            this.volume -= 5;
        }
    }

    @Override
    public String eleMember() {
        return "type : " + this.type + " volume : " + this.volume + " price : " + this.price;
    }
}
