package Threads;
class Box<T> {
    private T data;

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

public class Generics {
    public static void main(String[] args) {
     
        Box<Integer> intBox = new Box<>();
        intBox.setData(10); 
        int age = intBox.getData(); 
        System.out.println( age);

     
        Box<String> strBox = new Box<>();
        strBox.setData("Arun");
        String message = strBox.getData(); 
        System.out.println( message);
    }



    
}
