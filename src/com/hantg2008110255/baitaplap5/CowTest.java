package com.hantg2008110255.baitaplap5;

public class CowTest {
    public static void main(String[] args) {
        Cow cow;
        cow = new Cow();
        System.out.println("tuổi : "+cow.age);
        cow = new Cow(5.9);
        System.out.println("cân Nặng : "+cow.weight);
        cow= new Cow(4.9, 1);
        System.out.println("Tuổi : "+cow.age);
        System.out.println("Cân Nặng : "+cow.weight);
        
    }
    
}
