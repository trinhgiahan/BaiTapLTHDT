package com.hantg2008110255.baitaplap4;
import java.util.Scanner;
class Customer {

   String Name;
   String Address;
    String getName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên khách hàng : ");
        Name = sc.nextLine();
        return null;
        
    }
    String getAddress(){
       Scanner sc =new Scanner(System.in);
       System.out.println("Nhâp địa chỉ khách hàng : ");
       Address = sc.nextLine();
       return null;
    }
    void showCustomer(){
        System.out.println("   ---Customer Information---  ");
        System.out.println(" Name :  "+Name);
        System.out.println(" Address :  "+Address);
    }
    
}
