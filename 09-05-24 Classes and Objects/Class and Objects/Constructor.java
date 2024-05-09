// No argument constructor
//constructor overloading;
import java.util.*;

class A{

     A(){
        System.out.println("Constructor is called");
    }
}
class Area{
    int length;
    int width;
    Area(){
        length=10;
        width=5;
    }
    Area(int length1 , int width1){
        length=length1;
        width=width1;
    }
    public void getArea(){
        int area=length*width;
        System.out.println(area);
    }
}
public class Constructor {
    public static void main(String[] args) {
        A c1= new A();
        Area a1=new Area();
        Area a2 = new Area(20,10);
        a1.getArea();
        a2.getArea();

    }
    
}
