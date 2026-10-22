package task3;

import java.util.Date;
import task2.MyList;

public class Main {
    public static void main(String[] args) {
        MyList<Employee> employees = new MyList<>();

        employees.add(new Employee("E101", "Anil", 28, new Date()));
        employees.add(new Employee("E102", "Priya", 32, new Date()));
        employees.add(new Employee("E103", "Suresh", 25, new Date()));

        System.out.println("All employees:");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }

        employees.deleteByIndex(0);
        System.out.println("After deleting index 0:");
        employees.print();

        employees.deleteByValue(new Employee("E103", "Suresh", 25, new Date()));
        System.out.println("After deleting E103:");
        employees.print();
    }
}
