public class CircularQueue {
    private int[] arr;
    private int h;
    private int t;


    public CircularQueue(int c) {
        arr = new int[c];
        h = 0;
        t = 0;
    }

    public void enqueue(int x) {
        if (!isFull()) {
            arr[t] = x;
            t = (t + 1) % arr.length;
        }
        

    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Error");
            return -1;
            }

        int result = arr[h];
        h = (h + 1) % arr.length;
        return result;
    }

    public int head() {
        if (isEmpty()) {
            try {
                throw new Exception("Queue Is Empty");
            } catch (Exception e) {
            }
        }
        return arr[h];
    }

    public int size() {
        return ((t - h) + arr.length) % arr.length;
    }

    public int capacity() {
        return arr.length - 1;
    }

    public boolean isEmpty() {
        return h == t;
    }

    public boolean isFull() {
        if (h == ((t + 1 + arr.length) % arr.length)) {
            return true;
        } else return false;
    }


}
