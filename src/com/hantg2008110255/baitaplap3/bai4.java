package com.hantg2008110255.baitaplap3;
import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sinh viên : " );
        String hoten = sc.nextLine();
        System.out.println("Nhập điểm :  ");
        Double diem = sc.nextDouble();
        if (diem<9){
            System.out.println("Học lực xuất sắc");
        }if(7.5 <= diem){
            System.out.println("Học Lực Giỏi");
        }
    }
    
}
