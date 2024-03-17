package Inheritance;

import java.util.ArrayList;

public class Main {

    public static void main(String [] args){

       ArrayList<Employee> employees = new ArrayList<>();

        Manager manager1 =new Manager("James", "pattinambakkam", 35000, "Manager", 10);
        employees.add(manager1);


        System.out.println(manager1.calcBonus());

        Developer dev1 =new Developer("Ambani", "Koyambedu", 25000, "Developer", "Java");
        employees.add(dev1);

        System.out.println(dev1.calcBonus());

        for(Employee emp : employees) System.out.println(emp);

    }
    
}
