package com.hantg2008110255.kiemtragiuaky;

public class QuanLyTestDirve {
    public static void main(String[] args) {
        Nguoi hocvien = new HocVien("Trịnh Gia Hân ","19/3b",8, 9, 1);
        System.out.println(hocvien);
        Nguoi nhanvien = new NhanVien("Trịnh Gia Hân", "19/3b", 1);
        System.out.println(nhanvien);
        Nguoi khachhang = new KhachHang("Trịnh Gia Hân", "19/3b", "Một Thành Viên ", 2);
        System.out.println(khachhang);
    }
    
}
