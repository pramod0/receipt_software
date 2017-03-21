
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
            public static int nine=0,ten=0,eight=0,c11=0,c12=0,c13=0,c14=0,c15=0,s11=0,s12=0,JEE=0,CET=0;
            static int id=0;
             
    
        public static int generateID(int a)
        {
             StringBuilder sb = new StringBuilder();
            switch(a)
            {
                case 1: eight=eight+1;
                        sb.append(year);
                        sb.append(101);
                        sb.append(eight);
                        id=Integer.parseInt(sb.toString());
                        break;
                        
                case 2: nine=nine+1;
                        id=year+a+nine;
                        sb.append(year);
                        sb.append(102);
                        sb.append(nine);
                        id=Integer.parseInt(sb.toString());
                        break;
                        
                case 3: ten=ten+1;
                        id=year+a+ten;
                        sb.append(year);
                        sb.append(103);
                        sb.append(ten);
                        id=Integer.parseInt(sb.toString());
                        break;
                        
                case 4: c11=c11+1;
                        id=year+a+c11;
                        sb.append(year);
                        sb.append(104);
                        sb.append(c11);
                        id=Integer.parseInt(sb.toString());
                        break;
                        
                case 5: c12=c12+1;
                        id=year+a+c12;
                        sb.append(year);
                        sb.append(105);
                        sb.append(c12);
                        id=Integer.parseInt(sb.toString());
                        break;
                        
                case 6: c13=c13+1;
                        id=year+a+c13;
                        sb.append(year);
                        sb.append(106);
                        sb.append(c13);
                        id=Integer.parseInt(sb.toString());
                        break;
                        
                case 7: c14=c14+1;
                        id=year+a+c14;
                        sb.append(year);
                        sb.append(107);
                        sb.append(c11);
                        id=Integer.parseInt(sb.toString());
                        break;
                        
                case 8: c15=c15+1;
                        id=year+a+c15;
                        sb.append(year);
                        sb.append(108);
                        sb.append(c15);
                        id=Integer.parseInt(sb.toString());
                        break;
                        
                case 9: s11=s11+1;
                        id=year+a+s11;
                        sb.append(year);
                        sb.append(109);
                        sb.append(s11);
                        id=Integer.parseInt(sb.toString());
                        break;
                        
                case 10: s12=s12+1;
                        id=year+a+s12;
                        sb.append(year);
                        sb.append(110);
                        sb.append(s11);
                        id=Integer.parseInt(sb.toString());
                        break;
                     
                case 11: JEE=JEE+1;
                        id=year+a+JEE;
                        sb.append(year);
                        sb.append(111);
                        sb.append(JEE);
                        id=Integer.parseInt(sb.toString());
                        break;
                        
                case 12: CET=CET+1;
                        id=year+a+CET;
                        sb.append(year);
                        sb.append(112);
                        sb.append(CET);
                        id=Integer.parseInt(sb.toString());
                        break;
                        
            }
            return id;
        }
    
    
}
