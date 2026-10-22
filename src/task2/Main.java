package task2;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> numbers = new MyList<>();
        numbers.add(5);
        numbers.add(15);
        numbers.add(25);
        numbers.deleteByValue(15);
        System.out.print("Integers: ");
        numbers.print();

        MyList<String> names = new MyList<>();
        names.add("Ravi");
        names.add("Sita");
        names.add("Arjun");
        names.deleteByIndex(0);
        System.out.print("Strings: ");
        names.print();
        System.out.println("Name at index 1: " + names.get(1));

        MyList<Student> students = new MyList<>();
        students.add(new Student(1, "Kiran"));
        students.add(new Student(2, "Meena"));
        students.add(new Student(3, "Rahul"));
        students.deleteByValue(new Student(2, "Meena"));
        System.out.print("Students: ");
        students.print();

        for (int i = 0; i < 200; i++) {
            numbers.add(i);
        }
        System.out.println("Size: " + numbers.size() + ", Capacity: " + numbers.capacity());
    }
}