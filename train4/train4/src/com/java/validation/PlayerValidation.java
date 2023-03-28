package com.java.validation;

import com.java.model.Player;

public class PlayerValidation {

    public static boolean validation(Player player){
        if(player.getId()<=0){
            System.out.println("Player ID is invalid");
            return false ;
        }
        else if(player.getNumber()<0 || player.getNumber()>99){
            System.out.println("Player number is invalid");
            return false ;
        }
        return true ;
    }

}
