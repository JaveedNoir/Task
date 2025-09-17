package SocialMediaApp;

public class SocialMediaApp {
    User[] users;
    Post[] posts;
    Comment[] comments;
    int userCount = 0;
    int postCount = 0;
    int commentCount = 0;

    public void addUser(User user) {
        User[] newUsers = new User[userCount + 1];
        try {
            if (user == null) {
                throw new NullPointerException();
            }
            if (users == null) {
                users = new User[1];
                users[0] = user;
                userCount++;
                return;
            }
            for (int i = 0; i < users.length; i++) {
                newUsers[i] = users[i];
            }
            newUsers[newUsers.length - 1] = user;
            users = newUsers;
            userCount++;
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public void addPost(Post post) {
        Post[] newPosts = new Post[postCount + 1];
        try {
            if (post == null) {
                throw new NullPointerException();
            }
            if (posts == null) {
                posts = new Post[1];
                posts[0] = post;
                postCount++;
                return;
            }
            for (int i = 0; i < posts.length; i++) {
                newPosts[i] = posts[i];
            }
            newPosts[newPosts.length - 1] = post;
            posts = newPosts;
            postCount++;
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public void addComment(Comment comment) {
        Comment[] newComments = new Comment[commentCount + 1];
        try {
            if (comment == null) {
                throw new NullPointerException();
            }
            if (comments == null) {
                comments = new Comment[1];
                comments[0] = comment;
                commentCount++;
                return;
            }
            for (int i = 0; i < comments.length; i++) {
                newComments[i] = comments[i];
            }
            newComments[newComments.length - 1] = comment;
            comments = newComments;
            commentCount++;
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public void showAllPosts() {
        for (int i = 0; i < posts.length; i++) {
            System.out.println("-------------------");
            System.out.println("Post ID: "+posts[i].getPostId()+"      |");
            System.out.println("-------------------");
            System.out.println("Post: "+posts[i].getContent());
            System.out.println("Beyeni: "+posts[i].getLikeCount());
            System.out.println("Paylasan: "+posts[i].getAuthor().getUsername());
            if (comments != null) {
                for (int j = 0; j < comments.length; j++) {
                    if (posts[i].getPostId() == comments[j].getPostID()) {
                        System.out.println(comments[j].author.getUsername()+"-Serh: "+comments[j].getContent());
                    }
                }
            }
            System.out.println("***************************");

        }
    }


}
