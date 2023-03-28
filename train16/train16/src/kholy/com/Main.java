package kholy.com;

import kholy.com.model.*;

import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        Person[] person = new Person[2];
        Bill[] bill = new Bill[3];
        Order[] order = new Order[3];
        Food[] food = new Food[5];
        Gift[] gift = new Gift[2];
        // Enter Persons Details
        for(int i = 0 ; i < 2 ; i ++){
            person[i] = new Person();
            System.out.println("Enter Person " + (i+1) + " ID");
            person[i].setId(s.nextInt());
            System.out.println("Enter Person " + (i+1) + " Name");
            person[i].setName(s.next());
        }
        // Enter Orders Details
        for(int i = 0 ; i < 3 ; i ++){
            order[i] = new Order();
            System.out.println("Enter Order " + (i+1) + " ID");
            order[i].setId(s.nextInt());
            System.out.println("Enter Order " + (i+1) + " Name");
            order[i].setName(s.next());
            System.out.println("Enter Order " + (i+1) + " Foods");
            for(int j = 0 ; j < 5 ; j ++){
                food[i] = new Food();
                System.out.println("Enter Food " + (j+1) + "of Order " + (i+1) + " ID");
                food[i].setId(s.nextInt());
                System.out.println("Enter Food " + (j+1) + "of Order " + (i+1) + " Name");
                food[i].setName(s.next());
            }
            order[i].getFoods().add(food[i]);
        }

        gift[0] = new Gift();
        gift[0].setId(110);
        gift[0].setCode("Great");
        gift[0].setPerson(person[0]);

        gift[1] = new Gift();
        gift[1].setId(111);
        gift[1].setCode("Excellent");
        gift[1].setPerson(person[1]);

        bill[0] = new Bill();
        bill[0].getOrders().add(order[1]);

        bill[1] = new Bill();
        bill[1].getOrders().add(order[0]);
        bill[1].getOrders().add(order[2]);

        bill[2] = new Bill();
        bill[2].getOrders().add(order[0]);
        bill[2].getOrders().add(order[1]);
        bill[2].getOrders().add(order[2]);

        person[0].getBills().add(bill[0]);
        person[0].setGift(gift[0]);

        person[1].getBills().add(bill[1]);
        person[1].getBills().add(bill[2]);
        person[1].setGift(gift[1]);

        System.out.println(person[0].getBills().size());
        System.out.println(person[1].getBills().size());

        System.out.println(person[1].getBills().get(1).getOrders().get(1).getName());



    }
}