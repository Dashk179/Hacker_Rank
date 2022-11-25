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
public class DiagonalDifference {
    
   static int dimension;
   static double datos;
   static double total;
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner entrada = new Scanner(System.in);
         
          dimension = entrada.nextInt();
         
         double matrix[][] = new double [dimension][dimension];
          
          for (int i = 0; i < dimension; i++) {
              for (int j = 0; j < dimension; j++) {
                   datos = entrada.nextDouble();
                  matrix[i][j]= datos;
              }
        }
          for (int i = 0; i < dimension; i++) {
              System.out.println("\n");
              for (int j = 0; j < dimension; j++) {
                  System.out.print(matrix[i][j] + "\t");
              }
        }
          
          int vueltas = dimension*dimension;
          System.out.println(dimension);
          for (int i = 0; i < vueltas; i++) {
              for (int j = 0; j < vueltas; j++) {
                  total = matrix[i][j] + matrix[i][j];
              }
              
        }
        
         System.out.println(total);
    }
    
}
