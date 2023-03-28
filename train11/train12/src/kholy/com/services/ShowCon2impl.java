package kholy.com.services;

import kholy.com.model.User;

public class ShowCon2impl {

    public void print(User user){
        System.out.println("User ID is " + user.getId());
        System.out.println("User Text is " + user.getText());
        System.out.println("User Image is " + user.getImage());
    }

}
