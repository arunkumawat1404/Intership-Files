interface Sayable{  
    public String say();  
} 

public class Lambda3 {
    
    
    public static void main(String[] args) {  
        Sayable s=()->{  
            return "Lambda Expression with no parameter";  
        };  
        System.out.println(s.say());  
    }  
    }  
    

