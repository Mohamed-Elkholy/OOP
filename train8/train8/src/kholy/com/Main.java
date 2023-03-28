package kholy.com;

import kholy.com.model.Facebook;
import kholy.com.model.LinkedIn;
import kholy.com.posts.ShowFacebookPosts;
import kholy.com.posts.ShowFacebookPostsimpl;
import kholy.com.posts.ShowLinkedInPosts;
import kholy.com.posts.ShowLinkedInPostsimpl;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        Facebook facebook = new Facebook();
        System.out.println("Enter Facebook ID :- ");
        facebook.setId(s.nextInt());
        System.out.println("Enter Facebook Text :- ");
        facebook.setText(s.next());
        System.out.println("Enter Facebook Image :- ");
        facebook.setImage(s.next());
        ShowFacebookPosts showFacebookPosts = new ShowFacebookPostsimpl();
        showFacebookPosts.print(facebook);
        LinkedIn linkedIn = new LinkedIn();
        System.out.println("Enter LinkedIn ID :- ");
        linkedIn.setId(s.nextInt());
        System.out.println("Enter LinkedIn Text :- ");
        linkedIn.setText(s.next());
        System.out.println("Enter LinkedIn Image :- ");
        linkedIn.setImage(s.next());
        ShowLinkedInPosts showLinkedInPosts = new ShowLinkedInPostsimpl();
        showLinkedInPosts.print(linkedIn);
    }
}