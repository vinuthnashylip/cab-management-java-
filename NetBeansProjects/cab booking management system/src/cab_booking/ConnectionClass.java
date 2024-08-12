package cab_booking;

import java.sql.*;  

public class ConnectionClass 
{
    Connection con;
    Statement stm;
    public ConnectionClass()
    {  
        try
        {  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            con =DriverManager.getConnection("jdbc:mysql://localhost:3306/cab_booking","root","rooot");
            stm =con.createStatement();
        }
        catch(Exception e)
        { 
            System.out.println(e);
        }  
    }
}
