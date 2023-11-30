package com.example.prac.project1;

public class TV extends Electronic{
    int inch;
    public TV(){
        this.volume = 0;
        this.type = "video";
        this.inch = 40;
    }

    @Override
    public void soundUp() {
        super.soundUp();
        this.volume +=10;
    }

    @Override
    public void soundDown() {
        super.soundDown();
        if(this.volume -10 < 0){
            this.volume = 0;
        }else{
            this.volume -= 10;
        }
    }

    @Override
    public String eleMember() {
        return "type : " + this.type + " volume : " + this.volume + " inch : " + this.inch;
    }


}
