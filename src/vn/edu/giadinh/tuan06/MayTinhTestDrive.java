package vn.edu.giadinh.tuan06;

public class MayTinhTestDrive {
    public static void main(String[] args) {
        MayTinh mt = new MayTinh();
        int t1 = mt.tong(2, 3);
        int t2 = mt.tong(2, 3 , 4);
        System.out.println("Tổng là "+t1);
        System.out.println("Tổng là "+t2);
    }
}
