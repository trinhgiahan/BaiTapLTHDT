package com.hantg2008110255.baitaplap8;
;

public abstract  class SinhVienGD {
    private String hoten;
    private String nganh;
    

    SinhVienGD(String hoten,String nganh){
        this.hoten=hoten;
        this.nganh=nganh;
        
    }
    protected abstract double getDiem();
       
    protected void getHocLuc(){
        if(getDiem()<5){
            System.out.println("Học Lực yếu");
        }else if(getDiem()>=5){
            System.out.println("Học Lực Trung bình");
        }else if(getDiem()<=6.5){
            System.out.println("Học lực Trung bình ");
        }else if(getDiem()>=6.5){
            System.out.println("Học lực Khá");
        }else if(getDiem()<7.5){
            System.out.println("Học lực khá");
        }else if(getDiem()>=7.5){
            System.out.println("Học lực Giỏi");
        }else if(getDiem()<9){
            System.out.println("Học lực Giỏi");

        }else if (getDiem()>9){
            System.out.println("Học lực Xuất Sắc");
        }
            
    }
    void xuat(){
        System.out.println("Họ tên Sv: "+hoten);
        System.out.println("Ngành Sv: "+nganh);
        System.out.println("Diem Sv: "+getDiem());
    }
    public String getHoten() {
        return hoten;
    }
    public String getNganh() {
        return nganh;
    }
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    public void setNganh(String nganh) {
        this.nganh = nganh;
   }
    @Override
    public String toString() {
        return "SinhVienGD [hoten=" + hoten + ", nganh=" + nganh + "]";
    }


    
    
}
