package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JavaComparatorVic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }

        Arrays.sort(player, checker);
        for (Player player1 : player) {
            System.out.printf("%s %s\n", player1.name, player1.score);
        }
    }
}

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player p1, Player p2) {
        if(p1.score == p2.score) {
            return p1.name.compareTo(p2.name);
        }
        else {
            return p2.score - p1.score;
        }
    }
}

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}
