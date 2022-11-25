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
public class Java_String_Tokens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String regex = "[^a-zA-Z]+"; //Se crea el regex para encontrar la coincidencia
        scan.close();
        s = s.trim();//Eliminamos los espacios en blanco antes y despues del String
        if(s.length()==0){
            System.out.println(0);
            return;
        }
        String[] words = s.split(regex);//Cada que encuentrew una considencia guardara los datos en un arreglo
        System.out.println(words.length);//Obtenemos la dimension de los datos guardados en el arreglo
        
        for(String wors : words){//Se imprime cada elemento guardado en el arreglo
            System.out.println(wors);
        }
        
    }
    
}
