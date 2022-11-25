/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HackerRank_Java;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Dash
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        String a = entrada.next();
        String b = entrada.next();
        
        char[] cadena1= a.toCharArray();
         java.util.Arrays.sort(cadena1);
         String ordenadaa = new String(cadena1);
         
        char[] cadena2 =b.toCharArray();
        java.util.Arrays.sort(cadena2);
         String ordenadab = new String(cadena1);
         
         System.out.println(cadena1);
         System.out.println(cadena2);
        
        if (ordenadaa.equals(ordenadab)) 
            System.out.println("Anagrams");
        else{
            System.out.println("Not Anagrams");
        }
    }
    
}
