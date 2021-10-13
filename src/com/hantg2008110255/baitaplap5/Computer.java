package com.hantg2008110255.baitaplap5;
import java.util.Scanner;
class Computer {
    String nha_san_xuat;
    String he_dieu_hanh;
    String ram;
    String cpu;
    int gia;
    int nam_san_xuat;
    int nam_bao_hanh;

    String Nha_San_Xuat(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Nhà Sản Xuất Máy Tính : ");
        nha_san_xuat = sc.nextLine();
        return null;
    }
    String He_Dieu_Hanh(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Hệ Điều Hành Máy Tính: ");
        he_dieu_hanh = sc.nextLine();
        return null;
        
    }
    String RAM(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dung Lượng Ram Của Máy Tính Là : ");
        ram = sc.nextLine();
        return null;
    }
    void CPU(){
        Scanner sc = new Scanner(System.in);
        System.out.print("CPU của máy tính là : ");
        cpu= sc.nextLine();

    }
    void Gia(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Giá Bán của máy tính  là : ");
        gia = sc.nextInt();
    }
    void Nam_San_Xuat(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Năm Sản Xuất Của Máy Tính : ");
        nam_san_xuat = sc.nextInt();
        

    }
    void Nam_Bao_Hanh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Năm Bảo Hành Của Máy Tính : ");
        nam_bao_hanh = sc.nextInt();
        

    }
    void showComputer(){
        System.out.println("   ---Computer Imformation---  ");
        System.out.println(" Nhà Sản Xuất    : "+nha_san_xuat);
        System.out.println(" Hệ Điều Hành    : "+he_dieu_hanh);
        System.out.println(" RAM             : "+ram);
        System.out.println(" CPU             : "+cpu);
        System.out.println(" Giá Tiền        : "+gia);
        System.out.println(" Năm Sản Xuất    : "+nam_san_xuat);
        System.out.println(" Năm Bảo Hành    : "+nam_bao_hanh);
    
}
}
