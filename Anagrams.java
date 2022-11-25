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
public class Anagrams {


    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) // Si la cadena de caracteres es de tamano diferente retorna falso
        return false;
          
        a=a.toLowerCase(); // Se convierten los strings a minusculas
        b=b.toLowerCase();
        
        java.util.Map<Character,Integer> map = new java.util.HashMap<>();// se crea el hashmap
        for (int i = 0; i < b.length(); i++) {
            char letra = b.charAt(i); // Convertimos cada letra encontrada a una variable tipo caracter
            
            if (! map.containsKey(letra)) {
                map.put(letra, 1);   //por cada letra diferente que encontramos se le asigna de valor de 1
            }else{
                Integer frecuencua = map.get(letra);
                map.put(letra, ++frecuencua); // Si la letra no es diferente entonces eso nos quiere decir que ya existe por lo cual esa letra se le asigna +1
            }
        }
        
        for (int i = 0; i < a.length(); i++) {
            char letra = a.charAt(i);// Convertimos cada letra encontrada a una variable tipo caracter
            if (! map.containsKey(letra))return false; //Si encontramos una llave diferente osea un caracter diferente nos retornaria falso ya que una palabra anagrama debe contener las mismas letras(caracteres)
            
            Integer frecuencua = map.get(letra);
            
            if (frecuencua==0) {
                return false; //Si no contiene la letra osea que es 0 por cada letra se le asigno 1 entonces retorna falso
            }else
                map.put(letra,--frecuencua); //Si encontramos la letra reducimos a 1
        }
        
        
      return true;
    }
    public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
    
}
