import java.util.Arrays;
import java.util.Scanner;

public class Dequeue implements DequeueInterface{

    private Object[] array;
    private int start;
    private int end;
    private int size;

    static final int MAX = 5;
    public Dequeue(int size)
    {
        array = new Object[size];
        start = -1;
        end = 0;
        this.size = size;
    }

    @Override
    public void addItemFront(Object o) {
        if (start == 0 && end == size-1 || start == end+1) {
            System.out.println("Overflow");
        }
        if (start == -1) {
            start =0;
            end = 0 ;
        } else if (start == 0) {
            start = size -1;
        } else {
            start = start -1;

        }
        array[start] = o;
        System.out.println("Element added in front" + Arrays.toString(array));
    }

    @Override
    public void removeItemFront() {
        if (start == -1)
        {
            System.out.println("Underflow");
        }

        if (start == end)
        {
            start = -1;
            end = -1;
        }
        else
            if (start == size -1)
                start = 0;

            else
                start = start+1;
        System.out.println("Element removed from front" + Arrays.toString(array));
    }

    @Override
    public void addItemRear(Object o) {
        if (start == 0 && end == size-1 || start == end+1)
        {
            System.out.println(" Overflow ");
            return;
        }
        if (start == -1)
        {
            start = 0;
            end = 0;
        }
        else if (end == size-1)
            end = 0;
        else
            end = end+1;
        array[end] = o;
        System.out.println("Element added in front" + Arrays.toString(array));
    }

    @Override
    public void removeItemRear() {
        if (start == -1)
        {
            System.out.println(" Underflow");
        }
        if (start == end)
        {
            start = -1;
            end = -1;
        }
        else if (end == 0)
            end = size-1;
        else
            end = end-1;
        System.out.println("Element removed from rear" + Arrays.toString(array));
    }
}
