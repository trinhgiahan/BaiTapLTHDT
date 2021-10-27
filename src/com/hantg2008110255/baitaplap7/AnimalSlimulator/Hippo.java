package com.hantg2008110255.baitaplap7.AnimalSlimulator;

public class Hippo extends Animal{
    int x;
    int y;
    int a;
    int b;
    int c;
    Hippo(){}
    Hippo(int xx,int yy,int aa,int bb,int cc){
      
        x=xx;
        y=yy;
        a=aa;
        b=bb;
        c=cc;
    }
    @Overdive
    protected void boundaries() {
        System.out.println("Phạm vi lãnh thổ từ: "+a+" tới "+b);
    }
    protected void location(){
        System.out.println("Địa điểm Tọa độ : "+x+" và "+y);
    }
    @Overdive
    protected void hunger(){
        System.out.println("Mức độ đói : "+c);
    }
    @Overdive
    protected void food(){
        System.out.println("Food : Ăn trái cây,ăn cỏ ");
    }
    @Overdive
    protected void picture(){
        System.out.println("Hình ảnh Con Hà Mã!!!");

    }
    @Overdive
    protected void makeNoise(){
        System.out.println("Noise: Phát ra file tổng hợp các tiếng kêu của Con Hà Mã");
    }
    
}
