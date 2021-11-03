package com.hantg2008110255.baitaplap8;

public class SinhVienIT extends SinhVienGD{
    private double diemJava;
    private double diemCss;
    private double diemHTML;
    private double diem;

    
    
    SinhVienIT(String x, String y,Double a,Double b,Double c) {
        super(x, y);
        a=diemJava;
        b=diemHTML;
        c=diemCss;

    }
    @Override
    protected double getDiem() {
        diem=getDiemCss()+getDiemHTML()+getDiemJava();

        return 0;
   

    }
    @Overdive
    protected void xuat(){
        System.out.println("Điểm của SV là "+diem);
    }
   public double getDiemCss() {
       return diemCss;

   }
   public void setDiemCss(double diemCss) {
       this.diemCss = diemCss;
   }
   public double getDiemHTML() {
       return diemHTML;
   }public void setDiemHTML(double diemHTML) {
       this.diemHTML = diemHTML;
   }public double getDiemJava() {
       return diemJava;
   }public void setDiemJava(double diemJava) {
       this.diemJava = diemJava;
   }
   public void setDiem(double diem) {
       this.diem = diem;
   }
  
        
        
    }
  
        


