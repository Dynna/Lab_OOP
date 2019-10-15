package lab_2;
import java.lang.String;

class Queue {
    String[] queue;
    private int limit;
    private int index = 0;

    Queue(int limit) {
        this.limit = limit;
        queue = new String[limit];
    }
    Queue() {
        queue = new String[3];
    }

    void push(String item) {
        queue[index] = item;
        index++;
    }

    String pop() {
        return queue[--index];
    }

    boolean isEmpty() {
        return index == 0;
    }

    boolean isFull() {
        return index == limit;
    }
}

