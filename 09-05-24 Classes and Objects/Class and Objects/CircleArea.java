class Circle{
    double radius;

public Circle(double radius){
    this.radius=radius;
}
public double getRadius(double radius){
    return radius;
}
public void setRadius(double radius){
    this.radius=radius;
}
public double getArea(){
    return 3.14*radius*radius;
}
public double getCircumference(){
    return 2*3.14*radius;
}
}
public class CircleArea {
    public static void main(String []args){
        Circle c1 =new Circle(5);
        System.out.println(c1.getArea() );
        System.out.println(c1.getCircumference() );
        System.out.println("After modification of radius" );
        c1.setRadius(15);
        System.out.println(c1.getArea() );
        System.out.println(c1.getCircumference() );
    }
    
}
