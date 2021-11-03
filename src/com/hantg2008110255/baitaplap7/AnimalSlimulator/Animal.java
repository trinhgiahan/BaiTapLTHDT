package com.hantg2008110255.baitaplap7.AnimalSlimulator;

public class Animal {
    protected String picture;
    protected String food;
    protected int hunger;
    protected int boundaries;
    protected int location;
    protected String behavior;


   protected void makeNoise(){
        System.out.println("file tiếng kêu!!!");
    }
    protected void eat(){
        System.out.println("Ăn ");
    }
    protected void sleep(){
        System.out.println("Z..z..Z..z..Z..z");
    }
    protected void roam(){
        System.out.println("Di chuyển theo bầy đàn");
    }
    protected void boundaries(){
        System.out.println("Phạm vi lãnh thổ từ : ");
    }
    protected void behavior(){
        System.out.println("Behavior : Bảo vệ lảnh thổ, Đi kiếm ăn , Chăm sóc con non,Giao phối ");
    }
    protected void hunger() {
        System.out.println("Mức độ đói");
        
    }
  
        
    
    
}
