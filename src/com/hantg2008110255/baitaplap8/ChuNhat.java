package com.hantg2008110255.baitaplap8;


public class ChuNhat {
    private double chieuRong;
    private double chieuDai;
    private double cV;
    private double dT;
    public ChuNhat(Double n){
          n=chieuDai;
    }

    ChuNhat(){}
    protected ChuNhat(double chieuRong, double chieuDai){
         this.chieuDai = chieuDai; 
         this.chieuRong = chieuRong;
         
    }
    protected void getChuVi(){
        cV=(chieuDai+chieuRong)*2;

    }
    protected void getDienTich(){
        dT=chieuDai*chieuRong;
    }
    protected void xuat(){
        System.out.println("Chiều Dài của hình CN là : "+chieuDai);
        System.out.println("Chiều Rộng của hình CN là : "+chieuRong);
        System.out.println("Chu vi của hình CN là : "+cV);
        System.out.println("Diện tích của hình CN là : "+dT);
    }
    
    public double getChieuDai() {
        return chieuDai;
    }
    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }
    protected double getChieuRong() {
        return chieuRong;
    }
    protected void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }
    protected double getcV() {
        return cV;
    }
    protected void setcV(double cV) {
        this.cV = cV;
    }
    protected double getdT() {
        return dT;
    }
    protected void setdT(double dT) {
        this.dT = dT;
    }
   }
    

