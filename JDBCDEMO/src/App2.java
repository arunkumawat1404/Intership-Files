import java.sql.*;  

public class App2 {
    public static void main(String[] args)  {
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/investment","root","");  
            
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from dummytable");  
            while(rs.next())  
            System.out.println(rs.getString(1));  
            con.close();  
            }catch(Exception e){ System.out.println(e);}  
             

        
    }
}

