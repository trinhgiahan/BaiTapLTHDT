package com.hantg2008110255.kiemtragiuaky;

public class Nguoi {
    private String hoTen;
    private String diaChi;
    Nguoi(){}
    protected Nguoi(String name,String addres ){
        hoTen=name;
        diaChi=addres;
    }
    public String getHoTen() {
        return hoTen;
    }public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }public String getDiaChi() {
        return diaChi;
    }public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
}
