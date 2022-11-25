/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HackerRank_Java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import java.util.Scanner;
import javax.swing.JOptionPane;

import javax.swing.Timer;

/**
 *
 * @author Dash
 */
public class Cronometro implements ActionListener {

    int seconds, minutes, hours;
    static Timer Chronometer;
    static Date incio, fin;
    public static int ConMin;

   public Cronometro() {
        seconds = 0;
        minutes = 0;
        hours = 0;
        ConMin = 0;
        Chronometer = new Timer(1000, this);
        Chronometer.start();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        seconds++;
        ConMin++;
        if (seconds == 60) {
            minutes++;
            seconds = 0;
            
            if (minutes == 60) {
                hours++;

                minutes = 0;

            }
        }
        Date fecha = new Date();
//       Esto me sirve ya que aunque no es el formato de los datos me ayuda para 
//       contabilizar los minutos totales trabajado.
//      En pocas palabras combinaria un metodo que me proporcione la fecha y la hora y
//      para el registro de los minutos totales este metodo 
        String esto=(" Bitacora:  " + fecha + " Minutos Totales : " + ConMin);
        System.out.println(esto);
    }
    
    public static void Proceso(){
          Scanner entrada = new Scanner(System.in);
        String dato = entrada.next();

        String ter = "terminar";
        String ref = "empezar";
        boolean iniciar = dato.equals(ref);
        new Cronometro();
//        while (true) {            
//            
//        }

        while (iniciar) {
            incio = new Date();

            String dato2 = entrada.next();
            boolean terminar = dato2.equals(ter);
            if (terminar) {
                Chronometer.stop();
                fin = new Date();
                System.out.println("Tu datos gereados fueron los siguientes: \nInicio:" + incio
                        + "\nTerminado: " + fin + "\nMinutos total trabajdos: " + ConMin);
            }

        }
        
    }
    
    

    public static void main(String[] args) {
      
        Proceso();
    }

}


