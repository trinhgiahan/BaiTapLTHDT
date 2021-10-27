package vn.edu.giadinh.tuan07;

public class IntSquare {
    private int intValue;
    public IntSquare(){}
    public IntSquare(int i){
        intValue = i;
    }
    private int calculateSquare(){
        return intValue*intValue;
    }
    public int getSquare(){
        return calculateSquare();
    }
}
