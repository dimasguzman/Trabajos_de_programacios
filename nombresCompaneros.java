package com.mycompany.mavenproject;

/**
 *
 * @author Dimas
 */
public class nombresCompaneros {

    public static void main(String[] args) {

        String[] nombres = new String[9];
        nombres[0] = "Carlos";
        nombres[1] = "Kevin";
        nombres[2] = "Magdaly";
        nombres[3] = "Jorge";
        nombres[4] = "Karla";
        nombres[5] = "Karen";
        nombres[6] = "Suyapa";
        nombres[7] = "Nelson";
        nombres[8] = "Oscar";
        nombres[9] = "Esdras";
        for (int i = 0; i < nombres.length; i = i + 1) {

            System.out.println("los nombres de mis companeros son " + nombres[i]);
        }

    }
}
