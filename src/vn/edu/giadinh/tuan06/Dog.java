package vn.edu.giadinh.tuan06;

public class Dog {
    //attriute
    String breed;//biến state
    String color;//biến state
    int age;
    String name;

    //Method
    //constructor
    Dog(){}
    Dog(String b , String c, int a){
        breed = b;
        color = c;
        age   = a;
    }
    void bark1(){
        System.out.println("Ruff Ruff !!!");
    }
    void duoiMeo(){
        System.out.println("Điểu mèo...");
    }
    void bark(int numOfbark){
        while (numOfbark > 0){
            System.out.println("Ruff!!!");
            numOfbark--;
        }
    }
}
