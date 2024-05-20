
//Product 
abstract class EnemyShip{
    private String name;
    private double amtDamage;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    
    public  void setDamage(double amtDamage){
        this.amtDamage=amtDamage;
    }
    public  double getDamage(){
        return amtDamage;
    }
    public void followHeroShip(){
        System.out.println(getName() + " Follows hero ship");

    }
    public  void displayEnemyShip(){
        System.out.println(getName() + " On the screen");

    }   
     public void enemyShipShoots(){
        System.out.println(getName() + " Shoots and done the damage " + getDamage());

    }
    public abstract void testEnemyShip();

}

//concrete product

class RocketEnemyShip extends EnemyShip{
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public  void followHeroShip(){}
    public  void displayEnemyShip(){}
    public  void enemyShipShoots(){}    
    public  void setDamage(double amtDamage){}
    public double getDamage(){}

}
class UFOEnemyShip extends EnemyShip{
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public  void followHeroShip(){}
    public  void displayEnemyShip(){}
    public  void enemyShipShoots(){}    
    public  void setDamage(double amtDamage){}
    public double getDamage(){}

}

//Factory 

class EnemyShipFactory{
    public EnemyShip makEnemyShip(){}
}