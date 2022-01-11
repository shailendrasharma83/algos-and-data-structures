package StacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {

    static class MyStack {
        private Queue mainQueue;
        private Queue secondaryQueue;
        private Queue temp;

        MyStack() {
            mainQueue = new LinkedList();
            secondaryQueue = new LinkedList();
        }

        public void push(Integer item) {
            secondaryQueue.add(item);

            while (!mainQueue.isEmpty()) {
                secondaryQueue.add(mainQueue.peek());
                mainQueue.remove();
            }

            temp = secondaryQueue;
            secondaryQueue = mainQueue;
            mainQueue = temp;
        }

        public Integer pop() {
            Integer item = (Integer) mainQueue.peek();
            mainQueue.remove();
            return item;
        }
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
