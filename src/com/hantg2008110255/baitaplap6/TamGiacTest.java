package com.hantg2008110255.baitaplap6;

public class TamGiacTest {
    public static void main(String[] args) {
        TamGiac tamGiac = new TamGiac("Tiangel.AIF",6, 360);
        System.out.println("Thông Tin Về Ứng dụng:");
        System.out.println("Chiều Cao tam giác : "+tamGiac.chieu_Cao);
        System.out.println("Xoay "+tamGiac.xoay_Bao_nhieu_do);
        System.out.println("Phát Âm Thanh Từ "+tamGiac.phat_Am_thanh);
        tamGiac.nhap_Chuot();
    }
}
