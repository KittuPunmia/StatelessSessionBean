/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

import java.util.ArrayList;
import javax.ejb.Local;

/**
 *
 * @author user
 */
@Local
public interface bankLocal {
    int[] accnoshow(int Useriteration);

    int accamountshow(int Useriteration);

    String[] acctypeshow();

    int withdraw(int withdrawamount, int Useriteration);

    int[] Transaction(int Useriteration);
    
    int deposit(int depositamount, int Useriteration);
    
    
}
