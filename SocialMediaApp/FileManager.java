package SocialMediaApp;

import java.io.*;

public class FileManager {
    int userCounter = 0;

    public void addUserFile(User[] user) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Users.txt"))) {
            for (int i = 0; i < user.length; i++) {
                if (user[i] != null) {
                    oos.writeObject(user[i]);
                    userCounter++;
                    System.out.println(user[i]);
                }
            }
            System.out.println("Userler Backup edildi!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void getUserFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Users.txt"))) {
            User[] users = new User[userCounter];
            for (int i = 0; i < userCounter; i++) {
                users[i] = (User) ois.readObject();
                System.out.println(users[i]);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
