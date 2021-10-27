package com.hantg2008110255.baitaplap7.ShapeSlimulator;

public class Amoeba extends Shape{
    int x;
    int y;
    Amoeba(){}
    Amoeba(int xx,int yy){
        x=xx;
        y=yy;
    }
    @Overdive
    protected void playSound(){
        System.out.println("Phát Tập tin từ file Amoeba.HIF");
    }
    protected void rotate(){
        System.out.println("Xoay theo tọa độ X = "+ x +" Và Y = "+ y);
    }
    protected void picture(){
        System.out.println("Hình Amoeba");
    }

}
