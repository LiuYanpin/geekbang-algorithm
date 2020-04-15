package array;

public class MyArray {
    private int[] data;
    private int actualCount = 0;

    public MyArray(int capacity) {
        data = new int[capacity];
    }

    public MyArray() {
        data = new int[0];
    }

    public int length() {
        return this.actualCount;
    }

    public void addAtHead(int value) {
        int[] newValue = new int[actualCount + 1];
        newValue[0] = value;
        for (int i = 0; i < length(); i++) {
            newValue[i + 1] = data[i];
        }
        this.data = newValue;
        this.actualCount++;
    }

    public int get(int index) {
        if (index < 0 || index >= actualCount) {
            return -1;
        }
        return this.data[index];
    }

    public void insertAt(int index, int value) {
        if (index < 0 || index > actualCount) {
            return;
        }
        int[] newArray = new int[actualCount + 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = this.data[i];
        }
        newArray[index] = value;
        for (int i = index; i < actualCount; i++) {
            newArray[i + 1] = this.data[i];
        }
        this.data = newArray;
        this.actualCount++;
    }

    public void add(int value) {
        ensureCapacity();
        this.data[actualCount++] = value;
    }

    private void ensureCapacity() {
        if (actualCount == this.data.length) {
            int[] newArray = new int[actualCount * 2];
            for (int i = 0; i < actualCount; i++) {
                newArray[i] = data[i];
            }
            this.data = newArray;
        }
    }
}
