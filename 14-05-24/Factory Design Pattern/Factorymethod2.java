import java.util.*;

//product 

interface Shape{

    public void getArea();
}
class Circle implements Shape {

       @Override
      public  void getArea(){
        int radius=5;
      double area= 3.14*radius*radius;
      System.out.println("Area of circle " + area);
}
}
class Square implements Shape {

      @Override
       public  void getArea(){
        int side=5;
       int area= side*side;
       System.out.println("Area of circle  " + area);
    }
}
class Rectangle implements Shape {

      @Override
       public  void getArea(){
        int length= 10;
        int width=5;
       int area= length*width;
    System.out.println("Area of circle  " + area);

}
}

//creator
abstract class ShapeFactory{
    public abstract Shape factoryMethod();
}
class CircleArea extends ShapeFactory {
       @Override
       public Shape factoryMethod(){
       return new Circle();
}
}
class SquareArea extends ShapeFactory {
       @Override
       public Shape factoryMethod(){
       return new Square();
}
}
class RectangleArea extends ShapeFactory {
       @Override
       public Shape factoryMethod(){
       return new Rectangle();
}
}


public class Factorymethod2 {

    public static void main(String[] args){
        ShapeFactory circle = new CircleArea();
        Shape s1 = circle.factoryMethod();
        s1.getArea();
        ShapeFactory square = new SquareArea();
       Shape s2 = square.factoryMethod();
       s2.getArea();
       ShapeFactory rectangle = new RectangleArea();
        Shape s3 = rectangle.factoryMethod();
        s3.getArea();
 }
 
    
}
