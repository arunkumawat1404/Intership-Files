/*
 A common real-life example of where a singleton pattern is useful is a logging system. 
 In an application, it's typical to have a single log file where all log messages are written.
To ensure all parts of the application log messages to the same log file, you can implement a logger as a singleton.
This ensures that there's only one instance of the logger in the entire application.
 */
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.registry.LocateRegistry;
import java.util.Scanner;
import java.io.File;

 class  Logger{
    private static Logger instance;
    private Logger(){

     }
     public  static Logger getInstance(){
        if(instance==null){
            instance = new Logger()  ;
        }
        return instance;
     }
     public void logs(String message){
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write(message);
            File obj = new File("filename.txt");
            Scanner myReader = new Scanner(obj);
          while (myReader.hasNextLine()) {
           String data = myReader.nextLine();
            System.out.println(data);
      }
            myWriter.close();
            myReader.close();
            
          } catch (IOException e) {
            System.out.println("An error occurred.");
            
          }

     }
}
public class SingletonExample {
    public static void main(String[] args) {
       // Logger log1 = Logger.getInstance();
       Logger log2 = Logger.getInstance();
        //log1.logs("This is my first log in the file");
    log2.logs("This is my second log in the file");

       /* if(log1==log2){
            System.out.println(" Log instances are same");
        }
        else{
            System.out.println("Log instances are different");
        }*/
    }
    
}
