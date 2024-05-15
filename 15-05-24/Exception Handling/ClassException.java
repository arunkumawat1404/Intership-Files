public class ClassException {
    public static void main(String args[])
    {

        try {

            Class.forName("FindMissingClass");
        }

        catch (ClassNotFoundException ex) {

            ex.printStackTrace();
        }
    }
    
}
