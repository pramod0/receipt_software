
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class ID {
            public static int year = Calendar.getInstance().get(Calendar.YEAR);
            //public static int nine=1,ten=1,eight=1,c11=1,c12=1,c13=1,c14=1,c15=1,s11=1,s12=1,JEE=1,CET=1,
            public static int rno=0;
            public static String id=null;
            public static String rno2=null,st;
      public static String generateID(String a,String c,int c2)
        {
            Db db=Db.getDb();
            StringBuilder sb = new StringBuilder();
                        int var=c2+1;
                        sb.append(year);
                        sb.append(c);
                        sb.append(var);
                        id=sb.toString();
                        db.executeUpdate("update scount set count='"+var+"' where code="+"\""+c+"\""+"");
                        
             return id;
        }
     public static String generateRN(int c)
     {
         StringBuilder sb = new StringBuilder();
         Db db=Db.getDb();
         rno=c+1;
         System.out.println("Reeipt no:"+rno);
         sb.append(year);
         sb.append("/");
         sb.append(rno);
         rno2=sb.toString();
         System.out.println(rno2);
         db.executeUpdate("update scount set count='"+rno+"' where sr=1");
                        
         return rno2;
     }
 }
