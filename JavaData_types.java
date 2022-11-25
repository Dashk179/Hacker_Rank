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
public class JavaData_types {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        
        for (int i = 0; i < t; i++) {
             long x=sc.nextLong();
             System.out.println(x+" can be fitted in:");
             if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE)System.out.println("* byte");
             if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)System.out.println("* short");
             if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)System.out.println("* int");
             if(x>= Long.MIN_VALUE && x<=Long.MAX_VALUE)System.out.println("* long");
             
             
        }
    }
    
}
