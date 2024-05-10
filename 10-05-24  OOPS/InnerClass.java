class Animal{

    int num=5;
    public void details1(){
        System.out.println(" Animal is the dog from outer class");
    }

    class WildAnimals{

        public void details(){
            System.out.println("Animal is lion from inner class");
        }

    }
}

public class InnerClass {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.details1();
       // WildAnimals w1 = new WildAnimals();
       Animal.WildAnimals w1 = a1.new WildAnimals();
       w1.details();

    }
    
}
