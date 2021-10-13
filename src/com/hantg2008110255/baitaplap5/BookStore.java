package com.hantg2008110255.baitaplap5;
import java.util.Scanner;
class BookStore {
    String ten_sach;
    int gia_ban;
    String nha_xuat_ban;
    int nam_xuat_ban;
    int so_luong;
    String the_loai;

    String Ten_Sach(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Tên Sách : ");
        ten_sach = sc.nextLine();
        return null;
    }
    void Gia_Ban(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá bán của sách: ");
        gia_ban = sc.nextInt();
        
    }
    String Nha_Xuat_Ban(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhà Xuất Bản của sách là : ");
        nha_xuat_ban = sc.nextLine();
        return null;
    }
    void Nam_Xuat_Ban(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Năm Xuất Bản Của Sách là : ");
        nam_xuat_ban = sc.nextInt();

    }
    void So_Luong(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Số Lượng Của Sách : ");
        so_luong = sc.nextInt();
    }
    String The_Loai(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy Nhập Thể Loại Của Sách : ");
        the_loai = sc.nextLine();
        return null;

    }
    void showBook(){
        System.out.println("   ---Book Imformation---  ");
        System.out.println(" Tên Sách      : "+ten_sach);
        System.out.println(" Thể Loại Sách : "+the_loai);
        System.out.println(" Giá Bán       : "+gia_ban);
        System.out.println(" Nhà Xuất Bản  : "+nha_xuat_ban);
        System.out.println(" Năm Xuất Bản  : "+nam_xuat_ban);
        System.out.println(" Só Lượng      : "+so_luong);
        
    }
    
}
