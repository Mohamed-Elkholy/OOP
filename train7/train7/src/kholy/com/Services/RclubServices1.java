package kholy.com.Services;

import kholy.com.model.Rclub;

public class RclubServices1 implements Services2 {

    @Override
    public void print(Rclub rclub) {
        System.out.println("(((((Services one)))))");
        System.out.println("(RClub) : Player ID is : " + rclub.getId());
        System.out.println("(RClub) : Player Name is : " + rclub.getName());
        System.out.println("(RClub) : Player Number is : " + rclub.getNumber());
    }
}
