package com.hantg2008110255.baitaplap8;

public class Vuong extends ChuNhat {
    private double cV;
    private double dT;
        
    
   @Overdive
    protected void getChuVi(){
       cV=getChieuDai()*4;
        
   }
   @Overdive
   protected void getDienTich(){
       dT=getChieuDai()*getChieuDai();
   }
   @Overdive
    protected void xuat(){
       System.out.println("Cạnh của hình Vuông là : "+getChieuDai());
       System.out.println("Chu vi của hình vuông là :"+cV);
       System.out.println("Diện tích của hình vuông là: "+dT);
   }

}
