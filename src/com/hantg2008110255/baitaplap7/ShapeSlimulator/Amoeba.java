package com.hantg2008110255.baitaplap7.ShapeSlimulator;

public class Amoeba extends Shape{
    int x;
    int y;
    public Amoeba(String s,int xx,int yy){
         super(s);   
        x=xx;
        y=yy;
    }
    protected void rotate(){
        System.out.println("Xoay theo tọa độ X = "+ x +" Và Y = "+ y);
    }
    protected void picture(){
        System.out.println("Hình Amoeba");
    }
    

}
