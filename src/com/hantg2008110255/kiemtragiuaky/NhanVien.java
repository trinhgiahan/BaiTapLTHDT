package com.hantg2008110255.kiemtragiuaky;

public class NhanVien extends Nguoi{
    private float heSoLuong;
    NhanVien(){}
    protected NhanVien(String name,String addres,float heSoLuong){
        super(name,addres);
        this.heSoLuong=heSoLuong;

    }

    protected float tinhLuong(){
        return (heSoLuong*1500000);

    }
    @Overdive
    public String toString(){
        if(heSoLuong<0){
            System.out.println("Không hợp lệ");
        }
        String s;
        s= getHoTen()+ ","+getDiaChi();
        s += ", " + "Hệ Số Lương: "+heSoLuong;
        s += ","+"Tiền Lương: "+tinhLuong();
        return s;

    }
        

}

