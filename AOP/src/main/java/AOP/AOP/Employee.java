package AOP.AOP;

import org.springframework.stereotype.Component;

@Component("Employee")
public class Employee {
    String name;
    int age;
    Address address;
    int no_of_Days_Working;

    public void getName() {
        System.out.println("Getting Name");
    }

    public void setName() {
        System.out.println("Setting Name");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public void calculate_sal()
    {
        System.out.println("In Calculate Salary");
    }
}
