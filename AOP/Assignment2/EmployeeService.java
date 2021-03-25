package AOP.Assignment2;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class EmployeeService {
    ArrayList<Employee> emps;
    Validation valid = new Validation();

    public void addEmployee(){
       emps.add(new Employee());
    }
    public void addEmployee(long id, String fName , String lName , String email){
        emps.add(new Employee(id,fName,lName,email));
    }

    public void updateEmployee(){
        System.out.print("Enter ID to update your employee: ");
        Scanner s = new Scanner(System.in);
        long id = s.nextLong();
        for(Employee employee: emps)
        {

            valid.IDCheck((employee.getId()));

            {
                System.out.println("Your Record Found");
                System.out.println("First Name: "+ employee.getFName());
                System.out.println("Last Name: "+ employee.getLName());
                System.out.println("Email ID: "+ employee.getEmail());
                System.out.print("Choose field to update:(1/2/3 0-Exit");
                int choice;
                do {
                choice = s.nextInt();

                    switch (choice) {
                        case 1 :
                        {
                            System.out.print("Enter First Name:");
                            employee.setFName(s.next());
                            break;
                        }
                        case 2 :
                        {
                            System.out.print("Enter Last Name:");
                            employee.setLName(s.next());
                            break;
                        }
                        case 3 :
                        {
                            System.out.print("Enter Email:");
                            employee.setEmail(s.next());
                            break;
                        }
                        default :
                        	System.out.println("Invalid Choice");
                    }
                }while(choice!=0);
            }
        }
    }
    public void deleteEmployee(){
        System.out.println("In Delete Employee");
    }
    public long getID(Employee employee) throws IDNotFoundException
    {
        return employee.getId();
    }
}
