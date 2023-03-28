package kholy.com;

import kholy.com.model.User;
import kholy.com.services.ShowCon1impl;
import kholy.com.services.ShowCon2impl;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        User user1 = new User(s.nextInt() , s.next());
        User user2 = new User(s.nextInt() , s.next() , s.next());
        ShowCon1impl showCon1impl = new ShowCon1impl();
        ShowCon2impl showCon2impl = new ShowCon2impl();
        showCon1impl.print(user1);
        showCon2impl.print(user2);
    }
}