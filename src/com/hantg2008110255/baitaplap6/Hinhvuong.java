package com.hantg2008110255.baitaplap6;
import java.util.Scanner;
public class Hinhvuong {
    String phat_Am_thanh;
    int xoay_Bao_nhieu_do;
    int dien_Tich;

    Hinhvuong(String b,int c,int a){
        phat_Am_thanh = b;
        xoay_Bao_nhieu_do = a;
        dien_Tich = c;
    }
void nhap_Chuot(){
    System.out.println("Nhấn click để hình xoay ");
    Scanner bienNhap= new Scanner(System.in);
    int giaTriNhap = bienNhap.nextInt();
    switch(giaTriNhap){
        case 1 :hinh_Vuong();;break;
        default: System.out.println("Hãy chọn chức năng khác");
    }
       
    }
     
  
    void hinh_Vuong(){
        int height, width;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("height = ");
        height = sc.nextInt();
      
        System.out.print("width = ");
        width = sc.nextInt();  
        for(i = 1; i <= height; i++){
            for(int j = 1; j <= width; j++) {
                if(i == 1 || i == height || j == 1 || j == width)
                    System.out.print("*  ");
                else
                    System.out.print("   ");
            }
            System.out.println("");
        }
        System.out.println("\nHình Vuông đang Xoay 360 độ!!!!");
        System.out.println("\nĐang phát nhạc từ file Square.AIF!!!!");
        sc.close();
      }
      
    
}
