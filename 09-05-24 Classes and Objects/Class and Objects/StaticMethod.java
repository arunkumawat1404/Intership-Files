
class Example{

    static int model;
    String carName;
    int speed;
    
    public void detailsCar(){
        System.out.println("Car Name "  +carName + " Model " + speed + " Speed " + speed);
    }
    public static void details(Example car){
        System.out.println("Car Name "  +car.carName + " Model " + car.speed + " Speed " + car.speed);

    }
}
public class StaticMethod {
    public static void main(String[] args) {

      Example  car1 = new Example();
      car1.carName= " Thar";
      car1.speed=120;
      car1.model=2020;
      car1.detailsCar();

      Example.details(car1);


        
    }
    
}
