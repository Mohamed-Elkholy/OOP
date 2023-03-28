package kholy.com.services;

import kholy.com.model.Order;

public class ResturantControl extends ResturantServicesimpl{
    @Override
    public void showOrder(Order order) {
        System.out.println("Order ID is " + order.getId());
        System.out.println("Order Name is " + order.getOrderName());
    }
}
