
class ShoppingCart{
    public void addItems(String itemName){
        System.out.println(" Item name " +itemName);
    }
    public void addItems(String itemName , int quantity){
        System.out.println(" Item name " +itemName + " Quantity " + quantity);
    }
    public void addItems(String itemName , int quantity , int price){
        System.out.println(" Item name " +itemName + " Quantity " + quantity + " Price " + quantity*price);
    }
    public void addItems(String itemName , int quantity ,double price){
        System.out.println(" Item name " +itemName + " Quantity " + quantity + " Price " + quantity*price) ;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        ShoppingCart item1 = new ShoppingCart();
        ShoppingCart item2 = new ShoppingCart();
        ShoppingCart item3 = new ShoppingCart();
        ShoppingCart item4 = new ShoppingCart();
        item1.addItems(" Biscuit");
        item1.addItems(" Biscuit" , 2);
        item1.addItems(" Biscuit" , 2 , 10);
        item1.addItems(" Biscuit" , 2 , 10.5);
    }
    
}
