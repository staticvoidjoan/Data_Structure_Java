public class QUEUE<T> {
    private int[] v;
    private int t;

    public QUEUE(int c){
        v = new int[c];
        t = -1;
    }

    public void enqueue(int x) throws Exception {
       if (!isFull()) {
           t++;
           v[t] = x;
       }
       else throw new Exception("Queue is full");
    }

    public int dequeue() throws Exception {
        if (isEmpty()){
            throw new Exception("Queue is empty");
        }
        int result, i;
        result = v[0];
        for (i = 0; i < v.length; i++){
            v[i] = v[i+1];
        }
        t--;
        return result;
    }

    public int head() throws Exception {
        if (isEmpty()){
            throw new Exception("Queue is empty");
        }
        else return v[0];
    }

    public  int size(){
        return  t+1;
    }

    public int capacity(){
        return v.length;
    }

    public boolean isEmpty(){
        if (size() <= 0){
            return true;
        }
        else return false;
    }

    public boolean isFull(){
        if (size() == capacity()){
            return true;
        }
        else return false;
    }



}
