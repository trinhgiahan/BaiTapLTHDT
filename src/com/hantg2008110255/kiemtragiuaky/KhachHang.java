package com.hantg2008110255.kiemtragiuaky;

public class KhachHang extends Nguoi {
    private String tenCongty;
    private double triGiaHoaDon;

    protected KhachHang(String name , String addres , String tenCongTy , double triGiaHoaDon){
        super(name, addres);
        this.tenCongty=tenCongTy;
        this.triGiaHoaDon=triGiaHoaDon;
    }

    @Override
    public String toString() {
        if(triGiaHoaDon<0){
            System.out.println("Không hợp lệ");
        }
        String b;
        b =  "Tên : "+ getHoTen()+", ";
        b += "Địa chỉ : "+getDiaChi()+", ";
        b += "Tên Công Ty : "+tenCongty+", ";
        b += "Trị Giá Hóa Đơn : "+triGiaHoaDon;
        return b;
    }
    


}
