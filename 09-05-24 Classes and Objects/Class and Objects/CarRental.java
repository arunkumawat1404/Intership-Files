/*
Define a class CARRENTAL with the following details :
Class Members are : CarId of int type, CarType of string type and Rent of float type.
Define GetCar() method which accepts CarId and CarType.
GetRent() method which return rent of the car on the basis of car type,
 i.e. Small Car = 1000, Van = 800, SUV = 2500
ShowCar() method which allow user to view the contents of cars i.e. id, type and rent.
 * 
 */

 import java.util.*;
 class Car{

    int carId;
    String carType;
    int rent;
    public void getCar(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter car Id");
        carId =sc.nextInt();
        System.out.println("Enter car type");
        carType =sc.next();
    }
    public int getRent(){
        if(carType.equals("Small")){
            rent=1000;
        }
        else if(carType.equals("Van")){
            rent=800;
        }
        else if(carType.equals("SUV")){
            rent=2500;
        }
        
    return rent;
    }
    public void showCarDetails(){
        System.out.println(" Car Details ");
        System.out.println("Car Id: " + carId);
        System.out.println("Car Type: " + carType);
        System.out.println("Car Rent: " + rent);
    }
 }
public class CarRental {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.getCar();
        c1.getRent();
        c1.showCarDetails();
    }
    
}
