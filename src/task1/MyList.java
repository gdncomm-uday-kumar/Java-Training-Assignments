package task1;

public class MyList {
    private int[] data;
    private int size;

    public MyList() {
        data = new int[100];
        size = 0;
    }

    public void add(int value) {
        if (size == data.length) {
            resize(data.length * 2);
        }
        data[size] = value;
        size++;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return data[index];
    }

    public void deleteByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
        if (data.length > 100 && size <= data.length / 4) {
            resize(data.length / 2);
        }
    }

    public boolean deleteByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value) {
                deleteByIndex(i);
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return data.length;
    }

    private void resize(int newCapacity) {
        int[] newData = new int[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
