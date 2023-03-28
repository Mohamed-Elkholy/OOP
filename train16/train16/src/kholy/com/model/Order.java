package kholy.com.model;

import java.util.LinkedList;
import java.util.List;

public class Order extends Base2 {

    private List<Food> foods = new LinkedList<>();

    private Person person ;

    private Bill bill ;

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
