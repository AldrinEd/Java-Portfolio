package OOP.Polymorphism.Overloading;

public class Contact {
    int contactNumber;
    String contactPerson;

    void EmergencyContact(int contactNumber){
        System.out.println("Please Contact: " + contactNumber);
    }

    void EmergencyContact(String contactPerson){
        System.out.println("Please Contact: " + contactPerson);
    }

    public static void main(String[] args) {
        Contact con = new Contact();
        con.EmergencyContact("Aldrin");
        con.EmergencyContact(123);
    }
}

