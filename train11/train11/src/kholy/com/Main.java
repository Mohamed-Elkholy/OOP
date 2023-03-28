package kholy.com;

import kholy.com.model.Order;
import kholy.com.services.ResturantControl;
import kholy.com.services.ResturantServices;
import kholy.com.services.ResturantServicesimpl;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println("Enter Order ID :- ");
        order.setId(s.nextInt());
        System.out.println("Enter Order Name :- ");
        order.setOrderName(s.next());
        ResturantServices resturantServices = new ResturantControl();
        System.out.println(resturantServices.saveOrder(order).getOrderName()) ;
        resturantServices.showOrder(order);
    }
}