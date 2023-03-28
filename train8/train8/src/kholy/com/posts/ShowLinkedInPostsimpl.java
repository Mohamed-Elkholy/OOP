package kholy.com.posts;

import kholy.com.model.LinkedIn;

public class ShowLinkedInPostsimpl implements ShowLinkedInPosts{

    @Override
    public void print(LinkedIn linkedIn) {
        System.out.println("ID ====> " + linkedIn.getId());
        System.out.println("text ====> " + linkedIn.getText());
        System.out.println("image ====> " + linkedIn.getImage());
    }
}
