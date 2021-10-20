package com.hantg2008110255.baitaplap6;
import java.util.Scanner;
public class TamGiac {
    String phat_Am_thanh;
    int chieu_Cao;
    int xoay_Bao_nhieu_do;

    TamGiac(String b,int c,int a){
        phat_Am_thanh = b;
        xoay_Bao_nhieu_do = a;
        chieu_Cao = c;
        
       
    }
void nhap_Chuot(){
    System.out.println("Nhấn click để hình xoay ");
    Scanner bienNhap= new Scanner(System.in);
    int giaTriNhap = bienNhap.nextInt();
    switch(giaTriNhap){
        case 1 :tam_Giac();;break;
        default: System.out.println("Hãy chọn chức năng khác");
    }
       
    }  
void tam_Giac(){
    Scanner sc = new Scanner(System.in);
    int hight, k = 0;
    System.out.printf("Nhập vào chiều cao tam giac: ");
    hight = sc.nextInt();
    for (int i = 1; i <= hight; ++i, k = 0) {
      for (int space = 1; space <= hight - i; ++space) {
        System.out.print("  ");
      }
      while (k != 2 * i - 1) {
        System.out.print("* ");
        ++k;
      }
      System.out.println();
      
    }
    System.out.println("\nHình Tam giác đang xoay 360 độ!!!");
    System.out.println("\nĐang phat nhac tu file triangel.AIF!");
 
 } 
 
}

    
    

