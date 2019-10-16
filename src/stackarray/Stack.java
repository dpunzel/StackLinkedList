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

    public T pop() {
        T itemToPop = this.stack[--numOfItems];
        // verify number of items greater
        // also check if stack has shrunk to 25% and resize if so
        if (numOfItems > 0 && numOfItems == this.stack.length/4) {
            resize(this.stack.length/2);
        }
        return itemToPop;
    }

    public boolean isEmpty() {
        return this.numOfItems == 0;
    }

    public int size() {
        return this.numOfItems;
    }

    private void resize(int capacity) {

        T[] stackCopy = (T[]) new Object[capacity];

        for (int i = 0; i < numOfItems; ++i)
            stackCopy[i] = this.stack[i];

        this.stack = stackCopy;
    }
}
