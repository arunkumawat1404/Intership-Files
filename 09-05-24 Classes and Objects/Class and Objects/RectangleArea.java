class Rectangle{
    private int length;
    private int width;

    public Rectangle(int length, int width){
        this.length= length;
        this.width=width;
    }
    
    public int area(){
        int area =length*width;
        return area;
    }
    public int perimeter(){
        int perimeter=2*(length+ width);
        return perimeter;
    }
}
public class RectangleArea {
    public static void main(String []args){
        Rectangle r1 =new Rectangle(10 ,5);
        System.out.print("Area" + " "+r1.area() + " Perimeter " +r1.perimeter() );
    }
    
}
