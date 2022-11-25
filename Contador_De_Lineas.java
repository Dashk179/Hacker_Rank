/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HackerRank_Java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
//import java.util.StringTokenizer;

/**'
 *
 * @author Dash
 */
public class Contador_De_Lineas {

    static int lines = 0;
    static int linesEmpty;
    static String flag;
   

    public static void Solution(File file) {
        try {
            if (file.exists()) {
                try (BufferedReader fileRead = new BufferedReader(new FileReader(file))) {

                    while ((flag = fileRead.readLine()) != null) {
                       //flag.trim(); recorre todo el contenido sin espacios
                        flag = flag.trim();
                       //Condicion para saber si la linea es comentario 
                       boolean condicion = flag.startsWith("//");
                       //Cada que lea una linea se contara como linea existente
                        lines++;
                        //Agrego un contador por cada condicion
                        if (flag.isEmpty()) {
                        //LinesEmpty cuenta el numero de coincidencias
                            linesEmpty++;
                        }
                        if (condicion) {
                            linesEmpty++;
                        }
                        if ("}".equals(flag)) {
                            linesEmpty++;
                           
                        }
                        if ("{".equals(flag)) {
                            linesEmpty++;
                        }

                    }
                    //Resto las lineas totales menos las concidencias 
                    lines = lines - linesEmpty;
                     
                    System.out.println("");
                    System.out.println("Lineas de codigo " + lines);

                }
            } else {
                System.out.println("No existen lineas de codigo");
            }
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        
        File file = new File("/Users/Dash/Desktop/Contador.txt");
        Solution(file);

    }

}
