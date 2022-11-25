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
public class prubas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try (Scanner in = new Scanner(System.in)) {
            int t=in.nextInt();
            for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                
                for (int j = 0; j < n; j++) {
                    
                    a += b;
                    if (j > 0) {
                        System.out.print(" ");
                        
                    }
                    System.out.print(a);
                    b = b * 2;
                   
                }
                System.out.print("\n");
            }
        }
    }
    
}
