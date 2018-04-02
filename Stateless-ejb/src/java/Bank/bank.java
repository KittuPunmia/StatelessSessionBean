/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

import java.util.ArrayList;
import javax.ejb.Stateless;

/**
 *
 * @author user
 */
@Stateless
public class bank implements bankLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
 private static int amval[]=new int[7];
private static int am[][]={{1000,0,0,0,0},{2000,0,0,0,0},{5000,0,0,0,0},{6000,0,0,0,0},{7000,0,0,0,0},{9000,0,0,0,0},{10000,0,0,0,0}};
private static int UserTransaction[]=new int[7];
private static int accno[]={101,102,103,104,105,106,107};
private static String []acctype={"S","C","S","C","S","C","S"};

int currentamount;
int cur;
int Useriteration=0;	
int lp1=0,lp2=0,lp3=0,lp4=0,lp5=0,lp6=0,lp7=0;

  // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public int[] accnoshow(int Useriteration) {
        return accno;
    }

    @Override
    public int accamountshow(int Useriteration) {
        int val;
        switch (Useriteration) {
            case 0:val=am[Useriteration][lp1];
            break;
            case 1:val=am[Useriteration][lp2];
            break;
           case 2:val=am[Useriteration][lp3];
            break;
           case 3:val=am[Useriteration][lp4];
            break;
           case 4:val=am[Useriteration][lp5];
            break;
           case 5:val=am[Useriteration][lp6];
            break;
           case 6:val=am[Useriteration][lp7];
            break;
          
            default:
                throw new AssertionError();
        }
	return val;
	
    }

    @Override
    public String[] acctypeshow() {
        return acctype;
    }

    @Override
    public int withdraw(int withdrawamount, int Useriteration) {
        int val;
        switch (Useriteration) {
            case 0:cur=am[Useriteration][lp1];
            am[Useriteration][++lp1]=cur-withdrawamount;
            val= am[Useriteration][lp1];
                
             break;
       case 1: cur=am[Useriteration][lp2];
            am[Useriteration][++lp2]=cur-withdrawamount;
            val=am[Useriteration][lp2];
                
             break;
       case 2: cur=am[Useriteration][lp3];
            am[Useriteration][++lp3]=cur-withdrawamount;
            val=am[Useriteration][lp3];
                
             break;
       case 3: cur=am[Useriteration][lp4];
            am[Useriteration][++lp4]=cur-withdrawamount;
            val=am[Useriteration][lp4];
                
             break;
       case 4: cur=am[Useriteration][lp5];
            am[Useriteration][++lp5]=cur-withdrawamount;
            val=am[Useriteration][lp5];
                
             break;
       case 5: cur=am[Useriteration][lp6];
            am[Useriteration][++lp6]=cur-withdrawamount;
            val=am[Useriteration][lp6];
                
             break;
       case 6: cur=am[Useriteration][lp7];
            am[Useriteration][++lp7]=cur-withdrawamount;
            val=am[Useriteration][lp7];
                
             break;
       
            
            default:
                throw new AssertionError();
        }
        
return val;
    }
    
   @Override
    public int[] Transaction(int Useriteration) {
          switch (Useriteration) {
            case 0:
            for(int i=0;i<=lp1;i++)
            {

             UserTransaction[i]=am[Useriteration][i];
           
            }
            break;
            case 1:
                for(int i=0;i<=lp2;i++)
            {
             UserTransaction[i]=am[Useriteration][i];
           
            }
            break;
            
           case 2:    for(int i=0;i<=lp3;i++)
            {
             UserTransaction[i]=am[Useriteration][i];
            
            }
             break;
           case 3:    for(int i=0;i<=lp4;i++)
            {
             UserTransaction[i]=am[Useriteration][i];
           
            }
             break;
           case 4:   for(int i=0;i<=lp5;i++)
            {
             UserTransaction[i]=am[Useriteration][i];
            
            }
             break;
           case 5:    for(int i=0;i<=lp6;i++)
            {
             UserTransaction[i]=am[Useriteration][i];

            }
            break;
           case 6:    for(int i=0;i<=lp7;i++)
            {
             UserTransaction[i]=am[Useriteration][i];
           
            }
            break;
          
            default:
                throw new AssertionError();
        }
          return UserTransaction;
    }

   
    @Override
    public int deposit(int depositamount, int Useriteration) {
        int val;
        switch (Useriteration) {
            case 0:cur=am[Useriteration][lp1];
            am[Useriteration][++lp1]=cur+depositamount;
            val= am[Useriteration][lp1];
                
             break;
       case 1: cur=am[Useriteration][lp2];
            am[Useriteration][++lp2]=cur+depositamount;
            val=am[Useriteration][lp2];
                
             break;
       case 2: cur=am[Useriteration][lp3];
            am[Useriteration][++lp3]=cur+depositamount;
            val=am[Useriteration][lp3];
                
             break;
       case 3: cur=am[Useriteration][lp4];
            am[Useriteration][++lp4]=cur+depositamount;
            val=am[Useriteration][lp4];
                
             break;
       case 4: cur=am[Useriteration][lp5];
            am[Useriteration][++lp5]=cur+depositamount;
            val=am[Useriteration][lp5];
                
             break;
       case 5: cur=am[Useriteration][lp6];
            am[Useriteration][++lp6]=cur+depositamount;
            val=am[Useriteration][lp6];
                
             break;
       case 6: cur=am[Useriteration][lp7];
            am[Useriteration][++lp7]=cur+depositamount;
            val=am[Useriteration][lp7];
                
             break;
       
            
            default:
                throw new AssertionError();
        }
        
return val;
  
        
    }
 
}
