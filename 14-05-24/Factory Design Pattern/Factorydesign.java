/*Factory Method Pattern
Implement the Factory Method design pattern.

The Factory Method is a creational design pattern that provides an 
interface for creating objects in a superclass but allows subclasses
 to alter the type of objects that will be created.

You are given code that includes a few vehicles types and their 
respective factories. Complete the factory method implementation
 such that each factory returns the correct vehicle.

Example:

VehicleFactory carFactory = new CarFactory();
VehicleFactory truckFactory = new TruckFactory();
VehicleFactory bikeFactory = new BikeFactory();

Vehicle myCar = carFactory.createVehicle();
Vehicle myTruck = truckFactory.createVehicle();
Vehicle myBike = bikeFactory.createVehicle();

myCar.getType();   // "Car"
myTruck.getType(); // "Truck"
myBike.getType();  // "Bike"
*/

import java.beans.VetoableChangeListenerProxy;
import java.util.*;

//product class

interface Veichle{

    String getType();
    int getModel();
}
class Car implements Veichle{
    @Override
    public String getType(){
        return " Car";
    }
    @Override
    public int getModel(){
        return 2020;
    }
}
class Truck implements Veichle{
    @Override
    public String getType(){
        return "Truck";
    }
    public int getModel(){
        return 2012;
    }
}
class Bike implements Veichle{
    @Override
    public String getType(){
        return "Bike";
    }
    public int getModel(){
        return 2022;
    }
}
// ctreator class
abstract class VehicleFactory{
    public abstract Veichle factoryMethod();

}
class CarFactory extends VehicleFactory{

    @Override
    public Veichle factoryMethod(){
        return new Car();
    }
}
class TruckFactory extends VehicleFactory{

    @Override
    public Veichle factoryMethod(){
        return new Truck();
    }
}
class BikeFactory extends VehicleFactory{

    @Override
    public Veichle factoryMethod(){
        return new Bike();
    }
}
public class Factorydesign{
    public static void main(String[] args) {
        VehicleFactory car1 =new CarFactory();
        Veichle v1 =car1.factoryMethod();
         System.out.println(v1.getType());
         System.out.println(v1.getModel());
        VehicleFactory truck1 =new  TruckFactory();
        Veichle v2 =truck1.factoryMethod();
        System.out.println(v2.getType());
        System.out.println(v2.getModel());
        VehicleFactory bike1 =new BikeFactory();
        Veichle v3 =bike1.factoryMethod();
        System.out.println(v3.getType());
         System.out.println(v3.getModel());
    }

}
