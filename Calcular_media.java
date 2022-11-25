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
public class Calcular_media {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double total=0;
        
        double [] arreglo;
        
        arreglo = new double [8];
        arreglo[0]= 15.7;
        arreglo[1]= 9.8;
        arreglo[2]= 8.1;
        arreglo[3]= 12.4;
        arreglo[4]= 10.9;
        arreglo[5]= 10.2;
        arreglo[6]= 20.9;
        arreglo[7]= 9.9;
       
        for (int i = 0; i < arreglo.length; i++) {
            total = total + arreglo[i];
        }
        total = total/8;
        
        float xd  = (float)1/7;
        System.out.println(xd);
        System.out.println(total);
        
    }
    
}
