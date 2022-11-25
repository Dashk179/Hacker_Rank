/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HackerRank_Java;

import java.util.Scanner;

/**
 *Contexto:https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html 
 * https://www.youtube.com/watch?v=LjV8RpsjK9I
 * @author Dash
 */
public class Static_Initializer_block {

   static int B;
   static int H;
   static boolean flag = true;
   
   static {
   Scanner scanner = new Scanner(System.in);
   B = scanner.nextInt();
   H = scanner.nextInt();
   scanner.close();
   
       try {
           if (B <= 0 || H<= 0) {
              flag=false;
              throw new Exception("Breadth and height must be positive");
           }
       } catch (Exception e) {
           System.out.println(e);
           System.exit(0);
       }
           }
   
   
    public static void main(String[] args) {
        if (flag) {
            int area = B*H;
            System.out.println(area);
            
        }
    }
    
}
