/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package HackerRank_Java;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Dash
 */
public class Bowling {
    static String input; 
    static String values[];
    static String name;
    static int    points;  
    static int maxValue;
    HashMap<String,Integer> players;
    
    Bowling(){
        players = new HashMap<>();
    }
    
    public void addPlayers(String name, int p){
        players.put(name, p);
    }
    
    public void getWinner(){
        maxValue=(Collections.max(players.values()));
        for (Map.Entry<String,Integer>entry : players.entrySet()) {
            if (entry.getValue()==maxValue) {
                System.out.println(entry.getKey());
            }
        }
    }
    
    public static void main(String[] args) {
        Bowling game = new Bowling();
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            input = entrada.nextLine();
            values = input.split(" ");
            name = values[0];
            points = Integer.parseInt(values[1]);
            game.addPlayers(name, points);
        }
        game.getWinner();
    }

}
