import java.util.*;
abstract class  main extends  f_area {
    static void square(int l){
        int area = l*l;
        System.out.println("Area of square is: "+area);
        
    }
    static void rect(int l,int b){
        int area = l*b;
        System.out.println("area of rectangle :"+area);
    }
    public static void main(String[] args){
        square(5);
        rect(2,3);
    }
    


}
abstract class f_area{
    abstract void square();
    abstract void rect();
}    

