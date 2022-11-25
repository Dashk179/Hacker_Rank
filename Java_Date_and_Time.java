/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HackerRank_Java;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Dash
 */
public class Java_Date_and_Time {
      static  int year = 0;
       static int month = 0;
        static int day = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        year = entrada.nextInt();
        month = entrada.nextInt();
        day = entrada.nextInt();
          
        
       Calendar cal = Calendar.getInstance();
       cal.set(Calendar.YEAR,year);
       cal.set(Calendar.MONDAY, month);
       cal.set(Calendar.DAY_OF_MONTH, day);
        Date df = cal.getTime();
        DateFormat dff = new SimpleDateFormat("EEEEEEEE");
        String day = dff.format(df);
        System.out.println(day);
    }
    
}
