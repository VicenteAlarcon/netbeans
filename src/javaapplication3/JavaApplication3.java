/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author sento
 */
import java.util.Scanner;
public class JavaApplication3 {

  /*
    Funció multiplicar
    */
    public static boolean majorEdat(int a){
        boolean majorEdat = false;
        if ( a>=18)
            majorEdat = true;
        return majorEdat;
    }
    public static void main(String[] args) {
       //declaració de variables
              Scanner sc = new Scanner(System.in);

        String cadena1, cadena2;
       
        

        System.out.print("Introduce cadena1: ");
        cadena1 = sc.nextLine();
        
        System.out.print("Introduce cadena2: ");
        cadena2 = sc.nextLine();
        
        if (cadena1.equalsIgnoreCase(cadena2))
            System.out.print("Son iguals");
        else
            
        System.out.print("Son diferents y otro commit y ahora un pull");
        
        }

    }



                 


            

      
