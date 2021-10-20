package com.hantg2008110255.baitaplap6;

public class HinhVuongTest {
    public static void main(String[] args) {
        Hinhvuong hinhVuong = new Hinhvuong("Square.AIF", 6, 360);
        System.out.println("Thông Tin Về Ứng dụng:");
        System.out.println("Diện Tích Hình Vuông : "+hinhVuong.dien_Tich);
        System.out.println("Xoay "+hinhVuong.xoay_Bao_nhieu_do);
        System.out.println("Phát Âm Thanh Từ "+hinhVuong.phat_Am_thanh);
        hinhVuong.nhap_Chuot();

    }
}