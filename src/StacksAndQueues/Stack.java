package StacksAndQueues;

public class Stack {
    private int maxLimit;
    private int max;
    private int[] elements;
    private int top;


    public Stack() {
        maxLimit = 1000;
        elements = new int[maxLimit];
        top = -1;
        max = 0;
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public void push(int element) {
        if (top >= maxLimit - 1) {
            throw new StackOverflowError();
        }
        this.elements[++top] = element;
        max = Math.max(max, element);

    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return this.elements[top--];
    }

    public int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return this.elements[top];
    }


    public void print() {
        for (int i = top; i > -1; i--) {
            System.out.print(" " + elements[i]);
        }
    }

    public int max() {
        return this.max;
    }

    public Integer[] get() {
        Integer[] temp = new Integer[top + 1];

        for (int i = 0; i <= top; i++) {
            temp[i] = Integer.valueOf(elements[i]);
        }

        return temp;
    }
}
