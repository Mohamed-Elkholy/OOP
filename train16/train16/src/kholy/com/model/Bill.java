package kholy.com.model;

import java.util.LinkedList;
import java.util.List;

public class Bill extends Base2 {

    private List<Order> orders = new LinkedList<>() ;

    private Person person ;

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
