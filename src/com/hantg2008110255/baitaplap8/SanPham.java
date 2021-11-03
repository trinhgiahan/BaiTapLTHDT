package com.hantg2008110255.baitaplap8;

public class SanPham {
    private String tenSp;
    private double donGia;
    private double giamGia;

    SanPham(){}
    public SanPham(String tenSp, double donGia, double giamGia){
         this.tenSp = tenSp; 
         this.donGia = donGia;
         this.giamGia = giamGia;
    }
    public SanPham(String tenSp, double donGia){ 

        this(tenSp, donGia, 10); 
        
        } 
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public double getGiamGia() {
        return giamGia;
    }
    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    public String getTenSp() {
        return tenSp;
    }
    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    protected void getThueNhapKhau(){
      System.out.println("Số tiền thuế phải trả thêm "+donGia*giamGia/100);
    }
    protected void xuat(){
        System.out.println("Tên của Sản Phẩm : "+tenSp);
        System.out.println("Đơn Giá Của Sản Phẩm là : "+donGia);
        System.out.println("Só tiền GIảm Giá :"+donGia*giamGia/100);
    }
}
   
    
    
  



    

