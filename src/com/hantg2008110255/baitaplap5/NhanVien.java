package com.hantg2008110255.baitaplap5;
import java.util.Scanner;
class NhanVien {
    String ten_nhan_vien;
    int luong;
    String dia_chi;
    String bo_phan_lam_viec;
    String ngay_sinh;

    void Ten_NV(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Tên Nhân Viên : ");
        ten_nhan_vien = sc.nextLine();
    }
    void Luong(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Lương Của Nhân viên : ");
        luong = sc.nextInt();
    }
    void Dia_Chi(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Địa Chỉ Của Nhân Viên : ");
        dia_chi = sc.nextLine();
    }
    void Bo_Phan_Lam_Viec(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bộ Phận Làm Việc : ");
        bo_phan_lam_viec = sc.nextLine();
    }
    String Ngay_Sinh(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Ngày Sinh Của Nhân Viên là : ");
        ngay_sinh = sc.nextLine();
        return null;
    }
    void showStaff(){
        System.out.println("   ---StaffImformation---  ");
        System.out.println("Tên Nhân Viên    : "+ten_nhan_vien);
        System.out.println("Lương Nhân Viên  :"+luong);
        System.out.println("Điạ chỉ          :"+dia_chi);
        System.out.println("Bộ Phận Làm Việc :"+bo_phan_lam_viec);
        System.out.println("Ngày Sinh        :"+ngay_sinh);
    }

    
}
