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
public class End_of_file {

    /**
     * End Of File (commonly abbreviated EOF)
     *https://www.youtube.com/watch?v=FxLOE2zsEbg
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        while (scanner.hasNext()) {
            System.out.println(count + " " + scanner.nextLine());
            count++;
                
        }
       
 
    }

}
