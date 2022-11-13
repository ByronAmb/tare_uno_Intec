package com.mycompany.tarea1_intecap;

import java.util.Scanner;

public class TAREA1_INTECAP {

    public static void main(String[] args) {

        Scanner sp = new Scanner(System.in);
        System.out.println("Ingrese su primer número");
        int num1 = sp.nextInt();
        System.out.println("Ingrese su segundo número");
        int num2 = sp.nextInt();
        System.out.println("Los números ingresado son " + num1 + " y " + num2);

        Scanner sp1 = new Scanner(System.in);
        System.out.println("Ingrese su primer nombre");
        System.out.println("Buenos dias, su nombre es " + sp1.nextLine());

        Scanner sp2 = new Scanner(System.in);
        System.out.println("Ingrese su  número entero");
        int entero = sp2.nextInt();
        System.out.println("su  doble es: " + entero*2 + " y su triple es: " +entero*3);
 
     
         Scanner sp3 = new Scanner(System.in);
        System.out.println("Ingrese una temperatura en grados centigrados");
       float num4 = sp.nextFloat();
         System.out.println("Su temperatura en grados Fahrenheit es "+(32+(9*num4)/5) );
    
        Scanner sp4 = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio de la circunferencia ");
       float radio = sp.nextFloat();
        System.out.println("La longitud de la circunferencia es: "+ 2*Math.PI*radio
                + "y el valor del área de la circunferencia es:"+ Math.PI*Math.pow(radio,2));
       
    }

}
