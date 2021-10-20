package vn.edu.giadinh.tuan06;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.age = 1;

        Dog dog2 = new Dog("China", "vang", 2);
        String name = "Bruno";
        dog2.name = name;
        System.out.println("Tên   : "+dog2.name);
        System.out.println("Giống : "+dog2.breed);
        System.out.println("Màu   : "+dog2.color);
        System.out.println("Tuổi  : "+dog2.age);
        dog2.bark1();
        dog2.duoiMeo();
        System.out.println("---END--");

        Dog d = new Dog();
        d.bark(2);
        
    }
    
}
