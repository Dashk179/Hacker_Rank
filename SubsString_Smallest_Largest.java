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
public class SubsString_Smallest_Largest {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        
       SortedSet<String> l1 = new TreeSet<>();
        for (int i = 0; i <= s.length() - k; i++) {
            l1.add(s.substring(i,i+k));
        }
        smallest = l1.first();
        largest = l1.last();
        // smallest = s.substring(k, s.length());

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

}
