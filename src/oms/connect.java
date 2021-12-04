 
package oms;
import java.sql.*;

public class connect {
    Connection c;
    Statement s ;
    public connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///ordermanagementsystem", "root","Adnan@1180");
            s = c.createStatement();
        }catch(Exception e ){
            e.printStackTrace();

        }
    }

}



