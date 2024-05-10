abstract class Animal{
    public abstract void makeSound();
       // System.out.println(" Animals make sound");
    
}
class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Bark");
    }
}

public class Abstract1 {
    public static void main(String[] args) {
     Animal d1 = new Dog();
       //Dog d1 = new Dog();
        d1.makeSound();
    }
    
}
