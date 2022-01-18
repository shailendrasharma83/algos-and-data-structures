package heap;

public class Heap {

    private int[] heap;
    private int size;

    public Heap(int capacity) {
        heap = new int[capacity];
    }

    public void insert(int value) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("Heap is Full");
        }

        heap[size] = value;
        fixHeapUpwards(size);
        size++;
    }

    public void delete(int index) {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Heap is Empty");
        }

        heap[index] = heap[size - 1];

        if (index == 0 || heap[index] < heap[getParent(index)]) {
            fixHeapDownwards(index, size - 1);
        } else {
            fixHeapUpwards(index);
        }
        size--;

    }

    private void fixHeapDownwards(int index, int lastIndex) {
        while (index < lastIndex) {
            int left = getChild(index, true);
            int right = getChild(index, false);
            int childToSwap;


            if (left > lastIndex || right > lastIndex) {
                break;
            } else if (left <= lastIndex && right > lastIndex) {
                childToSwap = left;
            } else {
                childToSwap = heap[left] > heap[right] ? left : right;
            }

            if (heap[index] < heap[childToSwap]) {
                int temp = heap[index];
                heap[index] = heap[childToSwap];
                heap[childToSwap] = temp;
            } else {
                break;
            }
            index = childToSwap;
        }
    }

    private void fixHeapUpwards(int index) {
        int newValue = heap[size];

        while (index > 0 && newValue > heap[getParent(index)]) {
            heap[index] = heap[getParent(index)];
            index = getParent(index);
        }

        heap[index] = newValue;
    }

    public boolean isFull() {
        return heap.length == size;
    }

    public boolean isEmpty() {
        return heap.length == 0;
    }

    public int getParent(int index) {
        return (index - 1) / 2;
    }

    public int getChild(int index, boolean left) {
        return 2 * index + (left ? 1 : 2);
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i]);
            System.out.print(", ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Heap heap = new Heap(20);
        heap.insert(80);
        heap.insert(75);
        heap.insert(60);
        heap.insert(68);
        heap.insert(55);
        heap.insert(40);
        heap.insert(52);
        heap.insert(67);

        heap.printHeap();

        heap.delete(0);
        heap.printHeap();
    }

}
