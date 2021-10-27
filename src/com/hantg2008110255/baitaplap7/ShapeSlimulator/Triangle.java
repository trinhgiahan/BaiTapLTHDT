package com.hantg2008110255.baitaplap7.ShapeSlimulator;

public class Triangle extends Shape{
    int k=0;
    Triangle(int height){
        for (int i = 1; i <= height; ++i, k = 0) {
          for (int space = 1; space <= height - i; ++space) {
            System.out.print("  ");
          }
          while (k != 2 * i - 1) {
            System.out.print("* ");
            ++k;
          }
          System.out.println();
        }
    }
    @Overdive
    protected void playSound(){
        System.out.println("Đang phát nhạc từ file Triangle.AIF");
    }
}
    

