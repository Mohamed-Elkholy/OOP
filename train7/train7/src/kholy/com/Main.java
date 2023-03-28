package kholy.com;

import kholy.com.Services.*;
import kholy.com.model.Fclub;
import kholy.com.model.Rclub;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        Fclub fclub = new Fclub();
        Rclub rclub = new Rclub();
        System.out.println("Enter Player of Fclub ID ");
        fclub.setId(s.nextInt());
        System.out.println("Enter Player of Fclub Name ");
        fclub.setName(s.next());
        System.out.println("Enter Player of Fclub Number ");
        fclub.setNumber(s.nextInt());
        System.out.println("Enter Player of Fclub Code ");
        fclub.setFcode(s.nextInt());

        System.out.println("Enter Player of Rclub ID ");
        rclub.setId(s.nextInt());
        System.out.println("Enter Player of Rclub Name ");
        rclub.setName(s.next());
        System.out.println("Enter Player of Rclub Number ");
        rclub.setNumber(s.nextInt());
        System.out.println("Enter Player of Rclub Code ");
        rclub.setRcode(s.nextInt());
        Services1 fclubservices1 = new FclubServices1();
        Services2 rclubservices1 = (Services2) new RclubServices1();
        Services1 fclubservices2 = (Services1) new FclubServices2();
        Services2 rclubservices2 = (Services2) new RclubServices2();
        fclubservices1.print(fclub);
        rclubservices1.print(rclub);
        fclubservices2.print(fclub);
        rclubservices2.print(rclub);
    }
}