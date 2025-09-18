package SocialMediaApp;

import static SocialMediaApp.Main.input;
import static SocialMediaApp.Main.random;

public class Post {
   private int postId;
    private String content;
    User author;
    private int likeCount;

    public Post(int postId, String content, int likeCount, User author) {
        this.postId = postId;
        this.content = content;
        this.likeCount = likeCount;
        this.author = author;
    }


    public void addLike(){
        likeCount++;
    }

   public void displayPost(){}



    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", content='" + content + '\'' +
                ", author=" + author +
                ", likeCount=" + likeCount +
                '}';
    }
}
