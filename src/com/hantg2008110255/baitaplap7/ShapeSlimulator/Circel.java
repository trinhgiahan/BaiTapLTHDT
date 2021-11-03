package com.hantg2008110255.baitaplap7.ShapeSlimulator;

public class Circel extends Shape
{
    String sound;
    
    public Circel(String s){
        super(s);
    }
    @Overdive
    protected void playSound(){
        System.out.println("Đang phát file Circle.AIF"+getSound());
    }
    protected void picture(){
        System.out.println("Hình Tròn");
    }

}
