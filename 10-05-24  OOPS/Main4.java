abstract class Animal {
    public abstract void sound();
}
class Elelphant extends Animal {
    @Override
    public void sound() {
        System.out.println("Elelphant is croosing the road");
    }
}
class Tiger extends Animal {
    @Override
    public void sound() {
        System.out.println("Tiger is hunting");
    }
}

public class Main4 {
    public static void main(String[] args) {
        Animal e1 = new Elelphant();
        e1.sound();

        Animal tiger = new Tiger();
        tiger.sound();
    }
}
