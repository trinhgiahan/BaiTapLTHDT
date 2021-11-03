package com.hantg2008110255.baitaplap7.ShapeSlimulator;

public class Square extends Shape {
    int height;
    int width;
    int i;
    public Square(String s,int w,int h){
        super(s);
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
         {
            super.playSound();
           
       }
    }
   
        
    

}
