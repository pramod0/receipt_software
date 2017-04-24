
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
            public static int rno=1;
            public static int id=0;
            public static String rno2=null,st;
     public static int generateID(int a,int c)
        {
             Db db=Db.getDb();
                        
             StringBuilder sb = new StringBuilder();
            switch(a)
            {
                case 1: int eight=c+1;
                        sb.append(year);
                        sb.append(101);
                        sb.append(eight);
                        id=Integer.parseInt(sb.toString());
                        db.executeUpdate("update scount set count='"+eight+"' where standard='"+a+"'");
                        break;
                        
                case 2: int nine=c+1;
                        //id=year+a+nine;
                        sb.append(year);
                        sb.append(102);
                        sb.append(nine);
                        id=Integer.parseInt(sb.toString());
                         //Db db=Db.getDb();
                         db.executeUpdate("update scount set count='"+nine+"' where standard='"+a+"'");
                        break;
                        
                case 3: int ten=c+1;
                        //id=year+a+ten;
                        sb.append(year);
                        sb.append(103);
                        sb.append(ten);
                        id=Integer.parseInt(sb.toString());
                        db.executeUpdate("update scount set count='"+ten+"' where standard='"+a+"'");
                        
                        break;
                        
                case 4: int c11=c+1;
                        //id=year+a+c11;
                        sb.append(year);
                        sb.append(104);
                        sb.append(c11);
                        id=Integer.parseInt(sb.toString());
                        db.executeUpdate("update scount set count='"+c11+"'where standard='"+a+"'");
                        
                        break;
                        
                case 5: int c12=c+1;
                        //id=year+a+c12;
                        sb.append(year);
                        sb.append(105);
                        sb.append(c12);
                        id=Integer.parseInt(sb.toString());
                        db.executeUpdate("update scount set count='"+c12+"' where standard='"+a+"'");
                        
                        break;
                        
                case 6: int c13=c+1;
                        //id=year+a+c13;
                        sb.append(year);
                        sb.append(106);
                        sb.append(c13);
                        id=Integer.parseInt(sb.toString());
                        db.executeUpdate("update scount set count='"+c13+"' where standard='"+a+"'");
                        
                        break;
                        
                case 7: int c14=c+1;
                        //id=year+a+c14;
                        sb.append(year);
                        sb.append(107);
                        sb.append(c14);
                        id=Integer.parseInt(sb.toString());
                        db.executeUpdate("update scount set count='"+c14+"' where standard='"+a+"'");
                        break;
                        
                case 8: int c15=c+1;
                        //id=year+a+c15;
                        sb.append(year);
                        sb.append(108);
                        sb.append(c15);
                        id=Integer.parseInt(sb.toString());
                        db.executeUpdate("update scount set count='"+c15+"' where standard='"+a+"'");
                        
                        break;
                        
                case 9: int s11=c+1;
                        //id=year+a+s11;
                        sb.append(year);
                        sb.append(109);
                        sb.append(s11);
                        id=Integer.parseInt(sb.toString());
                        db.executeUpdate("update scount set count='"+s11+"' where standard='"+a+"'");
                        break;
                        
                case 10: int s12=c+1;
                        //id=year+a+s12;
                        sb.append(year);
                        sb.append(110);
                        sb.append(s12);
                        id=Integer.parseInt(sb.toString());
                        db.executeUpdate("update scount set count='"+s12+"' where standard='"+a+"'");
                        break;
                     
                case 11: int JEE=c+1;
                        //id=year+a+JEE;
                        sb.append(year);
                        sb.append(111);
                        sb.append(JEE);
                        id=Integer.parseInt(sb.toString());
                        db.executeUpdate("update scount set count='"+JEE+"' where standard='"+a+"'");
                        break;
                        
                case 12: int CET=c+1;
                        sb.append(year);
                        sb.append(112);
                        sb.append(CET);
                        id=Integer.parseInt(sb.toString());
                        db.executeUpdate("update scount set count='"+CET+"' where standard='"+a+"'");
                        break;
                        
            }
            return id;
        }
     public static String generateRN(int reci,int c)
     {
         StringBuilder sb = new StringBuilder();
         Db db=Db.getDb();
         rno=c+1;
         sb.append(year);
         sb.append("/");
         sb.append(rno);
         rno2=sb.toString();
         db.executeUpdate("update scount set count='"+rno+"' where standard='"+reci+"'");
                        
         return rno2;
     }
     public static String Std(int index){
         switch(index)
         {
             case 1:st="VIII";
                    break;
             case 2:st="IX";
                    break;
             case 3:st="X";
                    break; 
             case 4:st="XI Comm";
                    break; 
             case 5:st="XII Comm";
                    break; 
             case 6:st="F.Y.Bcom";
                    break; 
             case 7:st="S.Y.Bcom";
                    break; 
             case 8:st="T.Y.Bcom";
                    break;
             case 9:st="XI Sci";
                    break;
                    
             case 10:st="XII Sci";
                    break;
                    
             case 11:st="JEE";
                    break;
                    
             case 12:st="CET";
                    break;
         }
         
         return st;
     }
       
}
