package com.hantg2008110255.baitaplap7.ShapeSlimulator;

public class Shape {
    private String sound;
    Shape(String s){
       s=sound;
    }
    protected void rotate(){
        System.out.println("Đang Xoay quanh 360");
    }
    protected void playSound(){
        System.out.println("Phát ra file có tên "+sound);
    }
    public void setSound(String sound) {
        this.sound = sound;
    }public String getSound() {
        return sound;
    }
    
}
