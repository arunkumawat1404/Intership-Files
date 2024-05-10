interface Veichle{


    //int num; can't be decalre it is by default stgatic and final

    void model();
    void catgory();


}

class Car implements Veichle{

    public void model(){
        System.out.println(" Model of car is 2020");
    }
    public void catgory(){
        System.out.println(" Car is Suv type");
    }

}

public class Interface {
    public static void main(String[] args) {
        Veichle maurti;
        maurti = new Car();
        maurti.model();
        maurti.catgory();
    }
    
}
