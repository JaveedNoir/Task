package Soical; //Task 5,7,8 burdadir

public class Main {
    public static void main(String[] args) {
        Post post = new Post("Java dersleri",350,26,5); //biz indi bunu bele yaziriq,bes
        // real layihede nece olurki? meselen User.post olmazki? demek istediyim bu referans isimizi asanlasdirmaq
        // ve elaqeni daha rahat qurmaq ucundurse niye manual yaziriq?
        User user = new User("Javid","Gulaliyev",23,post);

        user.userInfo();

    }
}

/*package oop;

public class Test {
    int a;

    public  void foo(Test test) {
        test.a = 3;
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.a = 85;
        test.foo(test);
        System.out.println(test.a);
    }
}

cavab 3 du cunki test.foo methodu cagrilir ve test.a beraber olur test 3 e
*/