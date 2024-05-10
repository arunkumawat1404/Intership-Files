final class Animal{

    private String animalName;

    public void sound(){
        System.out.println("Belong to parent animal class");
    }
}
class Birds{

    public void makesound(){
       
         System.out.println(  " Belong to birds parent class");
    }


}
class Dog extends Animal{

    public void sound(){
        System.out.println(" Child class for animal");
    }

}
class Pigeon extends Birds{
    
          public void makesound(){
            System.out.println("chold class for birds");

    }

}

public class FinalClass {

    public static void main(String[] args) {

        Animal a1 = new Animal();
        Dog d1 = new Dog();
        d1.sound();
        Birds b1 = new Birds();
        Pigeon p1 = new Pigeon();
        p1.makesound();
        
    }
    
}
