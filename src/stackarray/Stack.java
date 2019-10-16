package stackarray;

public class Stack<T> {

    private T[] stack;
    private int numOfItems;

    public Stack() {
        this.stack = (T[]) new Object[1];
    }

    public void push(T newData) {
        // check to see if array is full
        if (numOfItems == this.stack.length) {
            // double size of array if full
            resize(2*this.stack.length);
        }
    }

    private void resize(int capacity) {

        T[] stackCopy = (T[]) new Object[capacity];

        for (int i = 0; i < numOfItems; ++i)
            stackCopy[i] = this.stack[i];

        this.stack = stackCopy;
    }
}
