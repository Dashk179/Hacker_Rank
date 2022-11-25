/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HackerRank_Java;

import java.util.Scanner;

/**
 *
 * @author Dash
 */
public class Cacular_media_Mejorado {
  static double total = 0;
  static int size = 0;
  static Scanner entrada;
  static double [] arreglo;
  static double [] arreglo2;
  static double cuadrados;
  static double mediana;
  static double s;
  static double sraiz;
  static float n;
    
    
    public static void main(String[] args) {
        
      entrada = new Scanner(System.in);
        
      size = entrada.nextInt();
      
      arreglo = new double[size];
      arreglo2 = new double[size];
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]= entrada.nextDouble();
            total = total + arreglo[i];
        }
        total = total/size;
        
        for (int i = 0; i <arreglo.length; i++) {
            cuadrados =(arreglo[i]-total);
            cuadrados = Math.pow(cuadrados, 2);
            arreglo2[i]= cuadrados;
        }
        
        for (int i = 0; i < arreglo2.length; i++) {
            mediana = mediana + arreglo2[i];
        }
        
        
        size = size-1;
       
        n = (float)1/size;
       
        s = (n*mediana);
        
        sraiz=Math.sqrt(s);
         
         System.out.println("s = " +s);
         System.out.println("s raiz = " + sraiz);
         System.out.println( "Media " +total);
         System.out.println("mediana `" + mediana);
       
    }
    
}
