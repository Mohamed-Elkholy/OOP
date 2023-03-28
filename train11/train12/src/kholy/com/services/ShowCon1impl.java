package kholy.com.services;

import kholy.com.model.User;

public class ShowCon1impl {
    public void print(User user){
        System.out.println("User ID is " + user.getId());
        System.out.println("User Text is " + user.getText());

    }
}
