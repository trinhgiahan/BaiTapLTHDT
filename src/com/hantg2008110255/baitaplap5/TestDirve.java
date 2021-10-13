package com.hantg2008110255.baitaplap5;

public class TestDirve {
    public static void main(String[] args) {
        BookStore bookstore;
        bookstore = new BookStore();
        bookstore.Ten_Sach();
        bookstore.The_Loai();
        bookstore.Gia_Ban();
        bookstore.Nha_Xuat_Ban();
        bookstore.Nam_Xuat_Ban();
        bookstore.So_Luong();
        bookstore.showBook();



        Car car ;
        car = new Car();
        car.Ten_Chu_Xe();
        car.Dong_Xe();
        car.Nam_San_Xuat();
        car.Hang_San_Xuat();
        car.Dung_Lit_Xang();
        car.Giay_Phep();
        car.showCar();


        Computer computer;
        computer = new Computer();
        computer.Nha_San_Xuat();
        computer.He_Dieu_Hanh();
        computer.RAM();
        computer.CPU();
        computer.Gia();
        computer.Nam_San_Xuat();
        computer.Nam_Bao_Hanh();
        computer.showComputer();


        NhanVien nhanvien;
        nhanvien = new NhanVien();
        nhanvien.Ten_NV();
        nhanvien.Bo_Phan_Lam_Viec();
        nhanvien.Luong();
        nhanvien.Ngay_Sinh();
        nhanvien.Dia_Chi();
        nhanvien.showStaff();


        TaiKhoan taiKhoan;
        taiKhoan = new TaiKhoan();
        taiKhoan.Ten_KH();
        taiKhoan.So_Tai_Khoan();
        taiKhoan.So_Du_TK();
        taiKhoan.showKH();

        



    }
}
