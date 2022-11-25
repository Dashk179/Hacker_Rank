/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HackerRank_Java;

import java.util.Scanner;

/**
 *
 * @author Dash
 * Links de referencias https://dzone.com/articles/java-string-format-examples
 */
public class Java_Output_Formatting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //%s nos sirve para formatear una cadena del string y restamos -15 posiciones
                /*%d nos sirce para formatear una cadena de tipo integer (incl. byte, short, int, long, bigint) 
                  el formato que asigamos es de 3 digitos por lo cual quedartio de la siguiente manera %03d*/
                // /n nos sirve para tener un salto de linea y tener el formato que nos pide el problema 
                System.out.printf("%-15s%03d/n",s1 ,x);
            }
            System.out.println("================================");

    }
    
}
