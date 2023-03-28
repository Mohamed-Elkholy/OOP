package kholy.com.services;

import kholy.com.model.Order;

public abstract class ResturantServicesimpl implements ResturantServices{
    @Override
    public Order saveOrder(Order order) {
        return order;
    }

    @Override
    public abstract void showOrder(Order order) ;
}
