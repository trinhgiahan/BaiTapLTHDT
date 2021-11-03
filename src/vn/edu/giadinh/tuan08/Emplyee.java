package vn.edu.giadinh.tuan08;

import com.hantg2008110255.baitaplap7.AnimalSlimulator.Overdive;

public class Emplyee extends Person{
    protected int salary;
    @Overdive
    public String toString(){
        String s;
        s = name + "," + birthDay;
        s += "," + salary;
        return s;

    }
    
}
