package kholy.com.services;

import kholy.com.model.Order;

public interface ResturantServices {

    Order saveOrder(Order order);

    void showOrder(Order order);

}
