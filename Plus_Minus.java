/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HackerRank_Java;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Dash
 */
public class Plus_Minus {
    static double [] arreglo;
    static int size;
    static int positive;
    static int negative;
    static int zero;
    static float rpositive;
    static float rnegative;
    static float rzeros;
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        size = entrada.nextInt();
        
        arreglo = new double[size];
        
        
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]= entrada.nextDouble();
            if (true) {
                   if (arreglo[i]<0) {
                negative++;
                
            }
            else if(arreglo[i]>0)
                {
                positive++;
                
            }
              else if(arreglo[i]==0)
                {
                 zero++;
                
            }
            }
         
        }
      
          rpositive = (float)positive/size;
          rnegative = (float)negative/size;
          rzeros = (float)zero/size;
          
        DecimalFormat df = new DecimalFormat("#.000000");
        
       
        System.out.println("Positivos "+ df.format(rpositive));
        System.out.println("Negativos "+df.format(rnegative));
        System.out.println("Zeros "+df.format(rzeros));
        
    }
    
}
