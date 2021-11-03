package com.hantg2008110255.baitaplap7.ShapeSlimulator;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Circel circel = new Circel("Circel.aif");
        circel.picture();
        circel.rotate();
        circel.playSound();
        Amoeba amoeba = new Amoeba("Amoeba.hif" ,5, 10);
        amoeba.picture();
        amoeba.rotate();
        amoeba.playSound();
        Square square = new Square("Square.aif",5, 5);
        square.rotate();
        square.playSound();
        Triangle triangle = new Triangle("Triangle.aif", 06);
        triangle.rotate();
        triangle.playSound();

        
}
}
