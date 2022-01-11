package StacksAndQueues;
import java.util.Stack;

public class QueueUsingTwoStacks {

    static class MyQueue {
        // main stack
        static Stack<Integer> mainStack;

        // tack to keep track of max element
        static Stack<Integer> trackStack;

        MyQueue() {
            mainStack = new Stack<>();
            trackStack = new Stack<>();
        }

        public void enqueue(Integer element) {

            if(mainStack.isEmpty()) {
                mainStack.push(element);
                return;
            }

            while (!mainStack.isEmpty()) {
                trackStack.push(mainStack.pop());
            }

            mainStack.push(element);

            while (!trackStack.isEmpty()) {
                mainStack.push(trackStack.pop());
            }
        }

        public Integer dequeue(){
            return mainStack.pop();
        }
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
