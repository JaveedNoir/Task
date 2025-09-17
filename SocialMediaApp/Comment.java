package SocialMediaApp;

public class Comment {
    private int commentID;
    private int  postID;
    private String content;
    User author;
    Post post;

    public Comment(int commentID, String content, User author, Post post, int postID) {
        this.commentID = commentID;
        this.content = content;
        this.author = author;
        this.post = post;
        this.postID = postID;
    }

    public void displayComment(){
        System.out.println(author.getUsername());
        System.out.println(post.getContent());
        System.out.println("Serh: "+content);
    }

    public int getCommentID() {
        return commentID;
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentID=" + commentID +
                ", content='" + content + '\'' +
                ", author=" + author +
                ", post=" + post +
                '}';
    }
}
