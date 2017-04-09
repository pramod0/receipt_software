/*
 * This class gives an object which can be used
 * to connect to the database.
 */

/**
 *
 * @author pramodg
 */

import java.sql.*;
import javax.swing.JOptionPane;

public class Db {
    private static Db db; //create static instance of the class
    private Db(){} //create private constructor so no can create abject outside the class
    
    //create public static method to return object of the class
    public static Db getDb(){ 
        if(db == null){
         db = new Db();
        }
    return db;
    }
    
    //@returns ResultSet
    //@params String query
    protected ResultSet executeQuery(String query){
    
        try{
        Class.forName("com.mysql.jdbc.Driver");  
        ResultSet rs;
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classes","root","root123");
        Statement stmt=con.createStatement();
        rs = stmt.executeQuery(query);  
      
        return rs;
        }catch (ClassNotFoundException e){
            
        System.out.println("haresh Mysql class not found : ");         
        } catch (SQLException e){
            e.printStackTrace();
        System.out.print("Wrong SQL query : "+ query);         
        }
        
        return null;
    }
    protected void executeUpdate(String query){
    
        try{
        Class.forName("com.mysql.jdbc.Driver");  
            try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classes","root","root123")){ 
                Statement stmt=con.createStatement();
                stmt.executeUpdate(query);  
            }
        }catch (ClassNotFoundException e){
             JOptionPane.showMessageDialog(null,"NoT Entered");
           
        System.out.println("pramd Mysql class not found : ");         
        } catch (SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Duplicate Entry of ID Number is Not Allowed");
           System.exit(1); 
        System.out.print("Wrong SQL query : "+ query);         
        }
    }
    
}
