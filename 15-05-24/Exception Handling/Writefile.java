import java.io.FileWriter;
import java.io.IOException;

public class Writefile {
     public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("filename.txt");
      myWriter.write("Learning java is interesting... ");
      myWriter.close();
      System.out.println("Successfully written in the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
    
}
