package Soical;

public class User {
    String name;
    String surname;
    int age;
    Post post;


    User (String name,String surname,int age,Post post){
        this.name= name;
        this.surname=surname;
        this.age=age;
        this.post=post;
    }
    void userInfo (){
        System.out.println("Ad: "+name);
        System.out.println("Soyad: "+surname);
        System.out.println("Yas: "+age);
        System.out.println("*****************************");
        System.out.println("Paylasilan mention: "+post.name);
        System.out.println("Mentiona gelen baxis sayi: "+post.view);
        System.out.println("Mentiona gelen beyeni sayi: "+ post.like);
        System.out.println("Mentiona gelen yorum sayi: "+post.comment);
        System.out.println("*****************************");
    }
}