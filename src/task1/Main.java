package task1;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.print();

        System.out.println("Value at index 2: " + list.get(2));

        list.deleteByIndex(1);
        System.out.println("After deleting index 1:");
        list.print();

        list.deleteByValue(40);
        System.out.println("After deleting value 40:");
        list.print();

        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        System.out.println("Size: after adding " + list.size() + ", Capacity: " + list.capacity());

        for (int i = 0; i < 100; i++) {
            list.deleteByIndex(0);
        }
        System.out.println("Size: after deleting  " + list.size() + ", Capacity: " + list.capacity());
    }
}

