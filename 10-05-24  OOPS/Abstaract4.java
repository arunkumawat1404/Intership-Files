abstract class Shape3D{
    public abstract void surfaceArea();
    public abstract void volume();
}class Cube extends Shape3D{
    int side;
    public Cube(int side){
        this.side=side;
    }

    @Override
    public void surfaceArea(){
        System.out.println(side*side);
    }
    @Override
    public void volume(){
        System.out.println(side*side*side);
    }
}
class Sphere extends Shape3D{
    int radius;
    public Sphere(int radius){
        this.radius=radius;
    }

    @Override
    public void surfaceArea(){
        System.out.println(4*22.7*radius*radius);
    }
    public void volume(){
        System.out.println((4*22.7*radius*radius*radius)/3);
    }
}
public class Abstaract4 {
    public static void main(String[] args) {
        Shape3D c1= new Cube(6);
        Shape3D c2 = new Sphere(5);
        c1.surfaceArea();
        c1.volume();
        c2.surfaceArea();
        c2.volume();
    }
    
}
