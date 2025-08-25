package Exception4;

public class Main {
    public static void main(String[] args) {
        Person[] people = {new VIP("Seher", 4, 500),
                new Normal("Qedim", true, 0)};
        for (Person person : people){
            if (person instanceof VIP){
                VIP vip= (VIP) person;
                System.out.println("Ad: "+vip.name+"\n"+"Seviyye: "+vip.level+" \n"+"Balans: "+vip.balance);
            } else if (person instanceof Normal) {
                Normal normal = (Normal) person;
                System.out.println("Ad: "+normal.name+"\n"+"Yeni Istifadecidir? "+normal.isNewUser+" \n"+"Balans: "+normal.balance);

            }

            System.out.println("Balans + elave bonus! : "+  person.dicountPay());
            System.out.println("--------");
        }
    }
}
