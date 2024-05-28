public class Exception5 {
    public static void main(String[] args) {
        try {
          int[] myNumbers = {1, 2, 3};
          System.out.println(myNumbers[5]);
        } catch ( IndexOutOfBoundsException e) {
          System.out.println("Exception occured");
        } finally {
          System.out.println("The 'try catch' is finished.");
        }
      }
    
}
