package com.hantg2008110255.baitaplap8;

public class ChuNhatTestDirve {
    public static void main(String[] args) {
        ChuNhat chuNhat = new ChuNhat(4, 6);
        chuNhat.getChuVi();
        chuNhat.getDienTich();
        chuNhat.xuat();
        ChuNhat vNhat = new Vuong();
        vNhat.setChieuDai(6);
        vNhat.getChuVi();
        vNhat.getDienTich();
        vNhat.xuat();
        
        
    
}
}
