package com.hantg2008110255.baitaplap5;
import java.util.Scanner;
class TaiKhoan {
    String ten_kh;
    int so_tai_khoan;
    int so_du_tk;
String Ten_KH(){
    Scanner sc =new Scanner(System.in);
    System.out.print("Nhập Tên Khách Hàng : ");
    ten_kh = sc.nextLine();
    return null;
}
void So_Tai_Khoan(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhập Số Tài Khoản : ");
    so_tai_khoan = sc.nextInt();
}
void So_Du_TK(){
    Scanner sc =new Scanner(System.in);
    System.out.println("Nhập Số Dư Trong Tài Khoản : ");
    so_du_tk =sc .nextInt();
}
void showKH(){
    System.out.println("   ---CustomerImformation---   ");
    System.out.println("Tên Khách Hàng :"+ten_kh);
    System.out.println("Số Tài Khoản   :"+so_tai_khoan);
    System.out.println("Số Dư Hiện Có  :"+so_du_tk);
    System.out.println("   ---       END         ---");
}
    
}
