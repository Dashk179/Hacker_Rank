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
public class Ps0 {

    static int opc;
    static Scanner entrada;
    static String Fase[] = {"Planeacion", "Diseno", "Codificacion", "Compilacion",
        "Pruebas", "Postmorten"};
    static String Estimacion[] = {"Planeado", "Actual", "A la fecha", "% A la fecha"};
    static int datos;
    static int TiempoFase[][] = new int[6][4];
    
    public static void AgregarDatosTiempoFase_Planeado() {
        System.out.println("\nIngresa las Estimaciones Siguientes: \n");
        for (int a = 0; a < TiempoFase.length; a++) {
            System.out.print(Fase[a] + " = ");
           datos = entrada.nextInt();
            TiempoFase[a][0] = datos;
        }
      

    }
    
    public static void AgregarDatosTiempoFase_Actual(){
        System.out.println("ActualDatos");
    }

    public static void solutionTempoFase() {

        do {
            System.out.println("Datos Actuales de su tabla de Tiempo en la fase");
            for (int i = 0; i < Estimacion.length; i++) {
                System.out.print("[" + Estimacion[i] + "]");
            }
            System.out.println("");
            for (int j = 0; j < TiempoFase.length; j++) {
                for (int k = 0; k < TiempoFase[j].length; k++) {
                    System.out.print("[" + TiempoFase[j][k] + "]        ");
                }
                System.out.println(" " + Fase[j]);
            }
            System.out.println("\nRegistro en la fase(min) "
                    + "  \nSelecione una opcion:"
                    + "  \n1:Agregar datos en Planeado"
                    + "  \n2:Agregar datos en Actual"
                    + "  \n3:Agregar datos en A la Fecha"
                    + "  \n4:Agregar datos en % A la fecha");
            int opcTempo = entrada.nextInt();
            switch (opcTempo) {
                case 1 -> {
                    AgregarDatosTiempoFase_Planeado();
                }
                 case 2 -> {
                    AgregarDatosTiempoFase_Actual();
                }

            }
            System.out.println();
        } while (opc != 6);

    }

    public static void main(String[] args) {
        entrada = new Scanner(System.in);

        do {
            System.out.println("Bienvenido a tu registro Ps0 "
                    + "  \nSelecione una opcion:"
                    + "  \n1:Tiempo en la fase(min)"
                    + "  \n2:Defectos Introduccidos"
                    + "  \n3:Defectos Removidos"
                    + "  \n4:Bitacora de registros de tiempos\n");

            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    solutionTempoFase();
            }
        } while (opc != 6);
    }

}
