package StacksAndQueues;

import sorting.PrintUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueRemoval {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5};
        PrintUtils.printArray(new QueueRemoval().findPositions(arr, 5));

        System.out.println();
        int arr1[] = new int[]{2, 4, 2, 4, 3, 1, 2, 2, 3, 4, 3, 4, 4};
        PrintUtils.printArray(new QueueRemoval().findPositions(arr1, 4));
    }


    int[] findPositions(int[] arr, int x) {
        Queue<Item> queue = populateQueueFrom(arr);
        Queue<Item> removalOrder = new LinkedList<>();

        find(queue, x, removalOrder);

        return populateArrayFrom(removalOrder);
    }

    private Queue<Item> find(Queue<Item> queue, int x, Queue<Item> removalOrder) {
        if (queue.size() == 1) {
            return removalOrder;
        }

        List<Item> list = new ArrayList();
        Integer max = 0;
        Integer maxIndex = 0;

        while (!queue.isEmpty() && x > 0) {
            int temp = Math.max(queue.peek().getValue(), max);
            if (temp > max) {
                max = temp;
                maxIndex = list.size();
            }
            list.add(queue.remove());
            x--;
        }
        removalOrder.add(list.get(maxIndex));
        list.remove(list.get(maxIndex));

        for (Item item : list) {
            if (item.getValue() != 0) {
                item.setValue(item.getValue() - 1);
            }
            queue.add(item);
        }

        return find(queue, Integer.MAX_VALUE, removalOrder);

    }

    static private Queue<Item> populateQueueFrom(int[] arr) {
        Queue<Item> queue = new LinkedList<>();
        int counter = 1;
        for (int i : arr) {
            queue.add(new Item(Integer.valueOf(i), counter++));
        }
        return queue;
    }

    static private int[] populateArrayFrom(Queue<Item> queue) {
        int[] result = new int[queue.size()];
        int count = 0;
        while (!queue.isEmpty()) {
            result[count++] = queue.remove().getOriginalIndex();
        }
        return result;
    }

}

class Item {
    private Integer value;
    private int originalIndex;

    public Item(Integer value, int originalIndex) {
        this.value = value;
        this.originalIndex = originalIndex;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public int getOriginalIndex() {
        return originalIndex;
    }

}
