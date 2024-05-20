
//Product 
abstract class EnemyShip{
    String name;
    double amtDamage;
    public abstract void followHeroShip();
    public abstract void displayEnemyShip();
    public abstract void enemyShipShoots();
    public abstract void setDamage(double amtDamage);
    public abstract double getDamage();

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
    public EnemyShip makEnemyShip(St)
}