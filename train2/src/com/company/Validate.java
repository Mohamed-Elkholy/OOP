package com.company;

public class Validate {

    public static boolean validation(Player player){
        if(player.getNumber()<0){
            System.out.println("Invalid number");
            return false ;
        }
        else if(player.getName().length()<=5){
            System.out.println("Invalid name");
            return false ;
        }
        return true ;
    }

}
