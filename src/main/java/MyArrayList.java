import java.util.Arrays;

public class MyArrayList<E> {
    Object[] innerArray;
    int innerIndex = 0;

    public MyArrayList() {
        this.innerArray = new Object[10];
    }

    public MyArrayList(int capacity) {
        this.innerArray = new Object[capacity];
    }

    public int add(E element) {
        if (innerIndex > innerArray.length) {
            increase();
        }
        innerArray[innerIndex] = element;
        innerIndex++;
        return innerIndex - 1;
    }

    public void add(E element, int index) {
        if (innerIndex > innerArray.length) {
            increase();
        }
        innerArray[index] = element;
    }

    public E get(int index) {
        return (E) innerArray[index];
    }

    public E remove(int index) {
        E output = (E) innerArray[index];
        Object[] newArray = new Object[innerIndex - 1];
        int indexOld = 0;
        int indexNew = 0;
        while (indexNew != newArray.length) {
            if (indexOld == index) {
                indexOld++;
                continue;
            }
            newArray[indexNew] = innerArray[indexOld];
            indexNew++;
            indexOld++;
        }
        innerArray = Arrays.copyOf(newArray, newArray.length);
        --innerIndex;
        return output;
    }

    private void increase() {
        innerArray = Arrays.copyOf(innerArray, innerIndex + 10);
    }

    public int size() {
        return innerIndex;
    }

}
