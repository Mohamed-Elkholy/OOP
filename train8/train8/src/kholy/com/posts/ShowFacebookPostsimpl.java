package kholy.com.posts;

import kholy.com.model.Facebook;

public class ShowFacebookPostsimpl implements ShowFacebookPosts{
    @Override
    public void print(Facebook facebook) {
        System.out.println("ID ====> " + facebook.getId());
        System.out.println("text ====> " + facebook.getText());
        System.out.println("image ====> " + facebook.getImage());
    }
}
