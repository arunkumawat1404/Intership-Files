import java.sql.*;  

public class App3 {
    public static void main(String[] args)  {
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/investment","root","");  
            
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("DELETE from dummytable Where name='Arun'");  
            while(rs.next())  
            System.out.println(rs.getString(1));  
            con.close();  
            }catch(Exception e){ System.out.println(e);}  
             

        
    }
}


