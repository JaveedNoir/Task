package Stream;

import java.io.*;


public class ObjectStream {
    public static void main(String[] args) {
        ObjectCustomer[] objectCustomers = {
                new ObjectCustomer("Jey", "Hudson", 23),
                new ObjectCustomer("Harry", "Potter", 20),
                new ObjectCustomer("Hannibal", "Lecter", 38)};

        ObjectCustomer objcs = new ObjectCustomer("Karena", "Kapoor", 35);
        ObjectCustomer objcs2 = new ObjectCustomer("Havin", "Lemar", 24);


        try (ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("Object.txt"))) {
            ous.writeObject(objectCustomers);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        addCustomer(objcs);
        deleteCustomers(objcs2,"Jey");
        for (int i = 0; i <showCustomer().length ; i++) {
            System.out.println(showCustomer()[i]);
        }

    }

    static ObjectCustomer[] showCustomer() {
        ObjectCustomer[] objectCustomers2 = null;
        try {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Object.txt"))) {
                objectCustomers2 = (ObjectCustomer[]) ois.readObject();
            }


        } catch (NullPointerException | IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return objectCustomers2;
    }

    static void addCustomer(ObjectCustomer objectCustomers) {
        try  {
            ObjectCustomer[] oldArray = showCustomer();
            ObjectCustomer[] newArray = new ObjectCustomer[oldArray.length + 1];
            for (int i = 0; i < oldArray.length; i++) {
                newArray[i] = oldArray[i];
            }
            newArray[newArray.length -1 ]=objectCustomers;
            ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("Object.txt"));
            ous.writeObject(newArray);
            ous.close();


        } catch (NullPointerException | IOException e) {
            System.out.println(e.getMessage());
        }


    }
    static void deleteCustomers(ObjectCustomer objectCustomer, String name){
        ObjectCustomer[] objectCustomers = showCustomer();
        boolean isFound=false;
        for (int i = 0; i < objectCustomers.length; i++) {
            if (objectCustomers[i].getName().equals(name)){
                objectCustomers[i]=objectCustomer;
                isFound=true;
            }

        }
        if (!isFound){
            System.out.println("Customer "+ name+" tapilmadi!");
            return;
        }
        try(ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("Object.txt"))) {
            ous.writeObject(objectCustomers);
            System.out.println("Customer elave Edildi!");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}


