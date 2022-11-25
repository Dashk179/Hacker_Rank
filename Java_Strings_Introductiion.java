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
public class Java_Strings_Introductiion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
      int a = A.length();
      int b = B.length();
      
      int sum = a+b;
      
      
      int alf = A.compareTo(B);
      
        if (alf>0) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
        System.out.println(sum);
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) +
               B.substring(0,1).toUpperCase()+ B.substring(1) );
      
    }
    
}
