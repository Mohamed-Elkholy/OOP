package com.java.modelservices;

import com.java.model.Player;
import com.java.validation.PlayerValidation;

public class PlayerServicesimpl implements PlayerServices{


    @Override
    public void print(Player player) {
        if(PlayerValidation.validation(player)){
            System.out.println("Player ID is " + player.getId());
            System.out.println("Player name is " + player.getName());
            System.out.println("Player number is " + player.getNumber());
        }
    }
}
