package kholy.com.model;

import java.util.LinkedList;
import java.util.List;

public class Person extends Base2 {

    private List<Order> orders = new LinkedList<>() ;

    private List<Bill> bills = new LinkedList<>();

    private Gift gift ;

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Bill> getBills() {
        return bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }

    public Gift getGift() {
        return gift;
    }

    public void setGift(Gift gift) {
        this.gift = gift;
    }
}
