package SocialMediaApp;

import java.io.Serializable;

import static SocialMediaApp.Main.input;
import static SocialMediaApp.Main.random;

public class User implements Serializable {
   private int id;
   private String username;
   private String password;

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }



    public static User register() {
        int id =  10000 + random.nextInt(90000);
        System.out.println("********************************");
        System.out.println("Istifadeci adinizi teyin edin: ");
        String username = input.nextLine();
        System.out.println("Sifre teyin edin: ");
        String password = input.nextLine();
        System.out.println("********************************");
        System.out.println("ID: "+id + "\nUsername: " + username + "\nSifre: " + password);
        return new User(id, username, password);
    }

    public void login() {
        System.out.println("Istifadeci adi: ");
        String username = input.nextLine();
        System.out.println("Sifre: ");
        String password = input.nextLine();
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
