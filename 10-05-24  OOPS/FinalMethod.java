class Library{

    public final void viewBooks(){
        
        System.out.println(" The books are in library class");
    }

}
class Books extends Library{

    public void viewBooks(){
        System.out.println(" Books is being viewed");
    }

}

public class FinalMethod {
    public static void main(String[] args) {
        Library b1 = new Library();
        b1.viewBooks();
        Books b2 = new Books();
        b2.viewBooks();
    }
    
}
