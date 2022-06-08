public class Test {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(3);

        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(70);
        q.enqueue(100);
        q.enqueue(3);

        System.out.print(q.dequeue() + " , ");
        System.out.print(q.dequeue() + " , ");
        System.out.print(q.dequeue() + " , ");


    }
}
