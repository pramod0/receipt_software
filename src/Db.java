/*
 * This class gives an object which can be used
 * to connect to the database.
 */

/**
 *
 * @author pramodg
 */

import java.sql.*;

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
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Classes","root","");
                Statement stmt=con.createStatement();
                rs = stmt.executeQuery(query);  
            
        return rs;
        }catch (ClassNotFoundException e){
        System.out.println("Mysql class not found : ");         
        } catch (SQLException e){
            e.printStackTrace();
        System.out.print("Wrong SQL query : "+ query);         
        }
        
        return null;
    }
    protected void executeUpdate(String query){
    
         try{
        Class.forName("com.mysql.jdbc.Driver");  
   
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Classes","root","");                Statement stmt=con.createStatement();
            stmt.executeUpdate(query);  
            
        
        }catch (Exception e){
            e.printStackTrace();
        System.out.print(e);         
        }
    }
    

    }