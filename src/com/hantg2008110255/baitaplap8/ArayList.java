package com.hantg2008110255.baitaplap8;
import java.util.ArrayList;
import java.util.List;
public class ArayList {
    public static void main(String[] args) {
        List<SanPham> list = new ArrayList<>();
      
       
        for (SanPham sanPHam : list) {
            sanPHam.setDonGia(10000);
            sanPHam.setTenSp("Cocacola");
            sanPHam.setGiamGia(10);
            
        }
        System.out.println(list);
        


    }
  
    
}
