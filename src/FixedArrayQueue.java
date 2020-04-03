
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FixedArrayQueue<E> implements SimpleQueue<E> {

    private final int capacity;

    private int size;

    private int front;

    private int rear;

    private final E[] data;

    // TODO why do we need an explicit constructor?

    public FixedArrayQueue() {
        this(5);
    }

    @SuppressWarnings("unchecked")
    public FixedArrayQueue(final int capacity) {
        this.capacity = capacity;
        this.data = (E[]) new Object[capacity];
        this.size = 0;
        this.front = 0;
        this.rear = capacity - 1;
    }

    @Override
    public boolean offer(final E obj) {
        // DONE
        if (size < capacity) {
            size++;
            rear = (rear + 1) % capacity;
            data[rear] = obj;
            return true;
        }
        return false;
    }

    @Override
    public E peek() {
        // DONE
        if (size != 0)
            return data[front];
        else
            return null;
    }

    @Override
    public E poll() {
        // DONE
        if (!isEmpty()) {
            final E result = data[front];
            front = (front + 1) % capacity;
            size--;
            return result;
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        // DONE
        if (size == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public List<E> asList() {
        // DONE implement using an ArrayList preallocated with the right size
        List<E> list = new ArrayList<>(size);
        if (data[front] == null) {
            return list;
        }
        else {
            for (int i = 0; i < size; i++) {
                list.add(data[(front + i) % capacity]);
            }
        }
        return list;

    }
}
