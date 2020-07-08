
package com.mycompany.mavenproject6;

import java.util.Arrays;

/**
 *
 * @author Dimas
 */
public class proyecto6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nombres[][] = {
         
           {
           "Daniel",
           "Medina",
           "ELECTRONICA",
           "TEST",
           },
           {
             "Monica",
             " Jiz",
             "Computacion",
             "IMSA"
              },
             {
           "Magdaly",
           "varaona",
           "Electronica",
           "sin trabajo"
            },
            {
               "Carlos",
               "David",
               "Industrial",
                "IMSA"
               },
             {
             "Jorge",
             "antonio",
             "Computacion",
             "TEST"
             }};  
    {    
        
        for(int i=0;i<=nombres.length;i++)
            
       System.out.println(Arrays.toString(nombres[i]));
    }
    }
}
