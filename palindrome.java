/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HackerRank_Java;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Dash
 */
public class palindrome {

    static char charAt;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String s = entrada.next();

       StringBuilder b = new StringBuilder(s).reverse();
        if (s.equals(b.toString())) {
            System.out.println("Yes");
        }
        else{
            System.out.println("NO");
        }
      
    }

}
