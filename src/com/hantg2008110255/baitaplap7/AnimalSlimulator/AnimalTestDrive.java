package com.hantg2008110255.baitaplap7.AnimalSlimulator;
import java.util.Scanner;
public class AnimalTestDrive {
    public static void main(String[] args) {
        System.out.println("==========MENU==========");
        System.out.println("1.Dog Imformation ");
        System.out.println("2.Woft Iformation ");
        System.out.println("3.Lion Iformation");
        System.out.println("4.Cat Iformation");
        System.out.println("5.Tiger Iformation");
        System.out.println("6.Hippo Iformation");
        System.out.println("========END MENU========");
        System.out.println("Hãy chọn một chức năng");
        Scanner bienNhap= new Scanner(System.in);
        int giaTriNhap = bienNhap.nextInt();
        switch(giaTriNhap){
            case 1 :fileDog();;break;
            case 2 :fileWoft();;break;
            case 3 :fileLion();;break;
            case 4 :fileCat();;break;
            case 5 :fileTiger();;break;
            case 6 :fileHippo();;break;
            default: System.out.println("Hãy chọn chức năng khác");
        }

        }
    protected static void fileDog(){
        Dog dog = new Dog( 5, 10 , 7 , 8, 1) ;
        dog.picture();
        dog.familiaCanine();
        dog.location(); 
        dog.boundaries();
        dog.makeNoise();
        dog.roam();
        dog.sleep();
        dog.food();
        dog.hunger();
        dog.behavior();
        }
    protected static void fileWoft(){
        Woft woft = new Woft( 7, 9 , 8 , 11, 1) ;
        woft.picture();
        woft.familiaCanine();
        woft.location(); 
        woft.boundaries();
        woft.makeNoise();
        woft.roam();
        woft.sleep();
        woft.food();
        woft.hunger();
            woft.behavior();
            }
    protected static void fileLion(){
        Lion lion = new Lion( 8, 4 , 6 , 8, 2) ;
        lion.picture();
        lion.familiaFilie();
        lion.location(); 
        lion.boundaries();
        lion.makeNoise();
        lion.roam();
        lion.sleep();
        lion.food();
        lion.hunger();
        lion.behavior();
                } 
    protected static void fileHippo(){
        Hippo hippo = new Hippo( 9, 10 , 4 , 9, 3) ;
        hippo.picture();
        hippo.location(); 
        hippo.boundaries();
        hippo.makeNoise();
        hippo.roam();
        hippo.sleep();
        hippo.food();
        hippo.hunger();
        hippo.behavior();
                    } 
    protected static void fileCat(){
        Cat cat = new Cat( 3, 12 , 3 , 4, 1) ;
        cat.picture();
        cat.familiaFilie();
        cat.location(); 
        cat.boundaries();
        cat.makeNoise();
        cat.roam();
        cat.sleep();
        cat.food();
        cat.hunger();
        cat.behavior();
                        } 
    protected static void fileTiger(){
        Tiger tiger = new Tiger( 9, 15 , 12 , 9, 3) ;
        tiger.picture();
        tiger.familiaFilie();
        tiger.location(); 
        tiger.boundaries();
        tiger.makeNoise();
        tiger.roam();
        tiger.sleep();
        tiger.food();
        tiger.hunger();
     tiger.behavior();
                            } 
                            
                   
    }
    

