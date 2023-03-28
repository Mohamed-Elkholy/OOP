package com.company;


import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        Player player = new Player();
        System.out.println("Enter player number:- ");
        player.setNumber(s.nextInt());
        System.out.println("Enter player name:- ");
        player.setName(s.next());
        INFO info = new INFO();
        info.print(player);
    }
}
