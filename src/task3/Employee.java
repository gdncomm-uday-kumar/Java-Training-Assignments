package task3;

import java.util.Date;

public class Employee {
    private String id;
    private String name;
    private int age;
    private Date dateOfJoining;

    public Employee(String id, String name, int age, Date dateOfJoining) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dateOfJoining = dateOfJoining;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) obj;
        return id.equals(other.id);
    }

    @Override
    public String toString() {
        return "Employee(" + "id: " + id + ", " + "name: " + name + ", " + "age: "+ age + ", " + "DOJ : " + dateOfJoining + ")";
    }
}
