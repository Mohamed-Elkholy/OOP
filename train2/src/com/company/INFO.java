package com.company;

public class INFO {

    public void print(Player player){
        if(Validate.validation(player))
            System.out.println(player.getNumber() + " - " + player.getName());
    }

}
