package kholy.com.Services;

import kholy.com.model.Fclub;
import kholy.com.model.Rclub;

public class FclubServices1 implements Services1 {
    @Override
    public void print(Fclub fclub) {
        System.out.println("(((((Services one)))))");
        System.out.println("(FClub) : Player ID is : " + fclub.getId());
        System.out.println("(FClub) : Player Name is : " + fclub.getName());
        System.out.println("(FClub) : Player Number is : " + fclub.getNumber());
    }
}
