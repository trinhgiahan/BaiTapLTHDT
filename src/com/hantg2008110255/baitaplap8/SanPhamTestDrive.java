package com.hantg2008110255.baitaplap8;

public class SanPhamTestDrive extends SanPham{
  
    public SanPhamTestDrive(String tenSp, double donGia) {
        super(tenSp, donGia);
    }

    public static void main(String[] args) {
        SanPham sanPham = new SanPham("Cocacola",10000);
        sanPham.xuat();
        sanPham.getThueNhapKhau();
        SanPham sanPham2 = new SanPham("Sting",12000);
        sanPham2.xuat();
        sanPham2.getThueNhapKhau();
    
    }
}

