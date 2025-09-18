package SocialMediaApp;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        SocialMediaApp app = new SocialMediaApp();
        Post post = null;
        User user = null;
        Comment comment = null;
        System.out.println("||=======================================||");
        System.out.println("||              E V O C O M              ||");
        System.out.println("||      X O S   G E L M I S I N I Z      ||");
        System.out.println("||=======================================||");
        System.out.println();
        System.out.println();
        System.out.println("           ||=============||           ");
        System.out.println("           ||===M E N U===||           ");
        System.out.println("||=========||=============||=========||");
        System.out.println("||  1.  Qeydiyyat                    ||");
        System.out.println("||===================================||");
        System.out.println("||  2.  Giriş                        ||");
        System.out.println("||===================================||");
        System.out.println("||  3.  Yeni paylaşım                ||");
        System.out.println("||===================================||");
        System.out.println("||  4.  Paylaşımı bəyənmək           ||");
        System.out.println("||===================================||");
        System.out.println("||  5.  Paylaşıma şərh yazmaq        ||");
        System.out.println("||===================================||");
        System.out.println("||  6.  Bütün paylaşımları göstərmək ||");
        System.out.println("||===================================||");
        System.out.println("||  7.  Hesablari backup et/cixart   ||");
        System.out.println("||===================================||");
        System.out.println("||  0.  Çıxış                        ||");
        System.out.println("||===================================||");

        while (true) {
            System.out.print("Menu Secimi(1-7): ");
            int secim = input.nextInt();
            input.nextLine();
            switch (secim) {
                case 1:
                    User newUser = User.register();
                    if (newUser != null) {
                        app.addUser(newUser);
                        System.out.println("************************");
                        System.out.println("* Hesabiniz yaradildi! *");
                        System.out.println("************************");
                        break;
                    } else {
                        System.out.println("*********************************************");
                        System.out.println("*  Hesabiniz yaradilarken xeta bas verdi!   *");
                        System.out.println("*********************************************");

                    }


                case 2:
                    try {
                        if (app.users == null) {
                            throw new UserNotFoundException("******************************************\n" +
                                    "* Qeydiyattdan kecmis istifadeci yoxdur! \n" +
                                    "*******************************************");
                        }
                        boolean isFound = false;
                        while (!isFound) {
                            System.out.println("Istifadeci adiniz: ");
                            String username = input.nextLine();
                            System.out.println("Sifre: ");
                            String password = input.nextLine();
                            for (int i = 0; i < app.users.length; i++) {
                                if (app.users[i].getUsername().equals(username)
                                        && app.users[i].getPassword().equals(password)) {
                                    user = app.users[i];
                                    System.out.println("Giris ugurlu!");
                                    isFound = true;
                                    break;
                                }
                            }
                            if (!isFound) {
                                System.out.println("Sifre veya Istifadeci adi xetali!");
                            }
                        }
                    } catch (UserNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    if (user == null) {
                        System.out.println("!!!!!!!!!!!!!!!!!!!!!");
                        System.out.println("*    Giris edin!    *");
                        System.out.println("!!!!!!!!!!!!!!!!!!!!!");
                        break;
                    }
                    int postid = 10000 + random.nextInt(5000);
                    System.out.println("Postunuz yazin: ");
                    String content = input.nextLine();
                    int likeCount = 0;
                    post = new Post(postid, content, likeCount, user);
                    app.addPost(post);
                    System.out.println("************************");
                    System.out.println("* Postunuz paylasildi! *");
                    System.out.println("************************");
                    break;

                case 4:
                    if (user == null) {
                        System.out.println("!!!!!!!!!!!!!!!!!!!!!");
                        System.out.println("*    Giris edin!    *");
                        System.out.println("!!!!!!!!!!!!!!!!!!!!!");
                        break;
                    }
                    boolean isPostAvaiable = false;
                    while (!isPostAvaiable) {
                        app.showAllPosts();
                        System.out.println("Hansi postu beyenmek isteyirsiniz? ");
                        int choosePostId = input.nextInt();
                        input.nextLine();
                        for (int i = 0; i < app.posts.length; i++) {
                            if (app.posts[i].getPostId() == choosePostId) {
                                app.posts[i].addLike();
                                isPostAvaiable = true;
                                System.out.println("Postu beyendiniz: " + app.posts[i].getContent());
                                System.out.println("Beyeni sayi: " + app.posts[i].getLikeCount());
                                System.out.println("Postu yaradan" + app.posts[i].getAuthor().getUsername());
                                break;
                            }
                        }
                        if (!isPostAvaiable) {
                            System.out.println("Yanlis Post ID!");
                        }
                    }
                    break;

                case 5:
                    if (user == null) {
                        System.out.println("!!!!!!!!!!!!!!!!!!!!!");
                        System.out.println("*    Giris edin!    *");
                        System.out.println("!!!!!!!!!!!!!!!!!!!!!");
                        break;
                    }
                    app.showAllPosts();
                    System.out.println("Hansi posta serh yazmaq isteyirsiniz?\n(Post ID qeyd edin): ");
                    int choosePostId2 = input.nextInt();
                    input.nextLine();
                    for (int i = 0; i < app.posts.length; i++) {
                        if (app.posts[i].getPostId() == choosePostId2) {
                            System.out.println("Serh yaz: ");
                            String serh = input.nextLine();
                            Comment comment1 = new Comment(choosePostId2, serh, user, app.posts[i], app.posts[i].getPostId());
                            app.addComment(comment1);
                            comment1.displayComment();
                            break;
                        }
                    }
                    break;

                case 6:
                    try {
                        if (app.posts == null) {
                            throw new PostNotFoundException("Paylasilan Post Yoxdur!");
                        }
                        app.showAllPosts();
                    } catch (PostNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;


                case 7:
                    try {
                        if (app.users == null) {
                            throw new UserNotFoundException("******************************************\n" +
                                    "* Qeydiyattdan kecmis istifadeci yoxdur! \n" +
                                    "*******************************************");
                        }
                    } catch (UserNotFoundException e) {
                        System.out.println(e.getMessage());
                        break;
                    }
                    System.out.println("||===================================||");
                    System.out.println("||  1.  Backup (Yaddasa yazmaq)      ||");
                    System.out.println("||===================================||");
                    System.out.println("||  2.  Import (Yaddasdan yazmaq)    ||");
                    System.out.println("||===================================||");
                    int chooseMenu = input.nextInt();
                    input.nextLine();
                    switch (chooseMenu) {
                        case 1:
                            try {
                                if (app.users == null) {
                                    throw new UserNotFoundException("******************************************\n" +
                                            "* Qeydiyattdan kecmis istifadeci yoxdur! \n" +
                                            "*******************************************");
                                }
                                fileManager.addUserFile(app.users);
                                System.out.println("Backup edildi!");
                                break;
                            } catch (UserNotFoundException e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                            case 2:
                                try {
                                    if (app.users == null) {
                                        throw new UserNotFoundException("******************************************\n" +
                                                "* Qeydiyattdan kecmis istifadeci yoxdur! \n" +
                                                "*******************************************");
                                    }
                                   fileManager.getUserFile();

                                } catch (UserNotFoundException e) {
                                    System.out.println(e.getMessage());
                                    break;
                                }
                                break;


                        case 0:
                            System.out.println("Gorusmek Uzre!\nCreated By Javeed");
                            return;


                    }
            }

        }
    }
}


