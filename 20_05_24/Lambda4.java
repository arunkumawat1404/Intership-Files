interface Sayable1{  
    public String say(String name);  
} 
public class Lambda4 {
    public static void main(String[] args) {  
      
     
        Sayable1 s1=(name)->{  
            return name;  
        };  
        System.out.println(s1.say("Lambda expression with single paramter"));  
          
     
        Sayable1 s2= name ->{  
            return "Hello, "+name;  
        };
        System.out.println(s2.say("Arun"));   
     
    }

    
}
