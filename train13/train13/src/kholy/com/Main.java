package kholy.com;

import kholy.com.model.Player;
import kholy.com.model.Shirt;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        Player player = new Player();
        System.out.println("Enter Player ID ");
        player.setId(s.nextInt());
        System.out.println("Enter Player Name ");
        player.setName(s.next());
        Shirt shirt = new Shirt();
        System.out.println("Enter Shirt ID ");
        shirt.setId(s.nextInt());
        System.out.println("Enter Shirt Number ");
        shirt.setNumber(s.nextInt());

        player.setShirt(shirt);
        shirt.setPlayer(player);

        System.out.println(shirt.getPlayer().getName());
    }
}