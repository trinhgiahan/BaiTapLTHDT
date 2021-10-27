package com.hantg2008110255.baitaplap7.ShapeSlimulator;

public class Square extends Shape {
    int height;
    int width;
    int i;
    Square(int h,int w){
        height = h;
        width = w;

        for(i = 1; i <= h; i++){
            for(int j = 1; j <= w; j++) {
                if(i == 1 || i == h || j == 1 || j == w)
                    System.out.print("*  ");
                else
                    System.out.print("   ");
            }
            System.out.println("");
        }
    }
    @Overdive
    protected void playSound(){
       System.out.println("Đang phát nhạc từ file Square.AIF");
    }
        
    

}
