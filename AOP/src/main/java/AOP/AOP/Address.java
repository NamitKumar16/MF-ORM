package AOP.AOP;

public class Address {
    String hno;
    String landmark;
    String city;
    int pincode;

    public Address()
    {
        System.out.println("Constructor");
        System.out.println("Injecting Address Class");
    }
}
