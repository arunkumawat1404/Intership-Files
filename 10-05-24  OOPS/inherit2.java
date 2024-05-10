class Animal {
    public void makeSound(){
        System.out.print("This animal makes sound");

    }
}
class Cat extends Animal{
    //@Override public void makeSound(){
    //    System.out.println("Cats make sound");
    //}
}
public class inherit2 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Cat c1 = new Cat();
        a1.makeSound();
        c1.makeSound();

    }
    
}
