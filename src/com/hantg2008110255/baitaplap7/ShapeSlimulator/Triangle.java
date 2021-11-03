package com.hantg2008110255.baitaplap7.ShapeSlimulator;

public class Triangle extends Shape{
    int k=0;
    public Triangle(String s,int height){
        super(s);
        
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
   
}
    

