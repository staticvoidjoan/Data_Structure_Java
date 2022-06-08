import java.util.EmptyStackException;

public class Stack<T > {

    private int[] s;
    private int t;

    public Stack(int c) {
        s = new int[c];
        t = -1;

    }

    public void push(int x) {
        if (!isFull()) {
            t++;
            s[t] = x;
        } else {
            System.out.println("Stack is full");

        }

    }

    public int pop() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        } else{
            t--;
            return s[t + 1];}
    }

    public int peek() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        return s[t + 1];
    }

    public int size() {
        return t + 1;
    }

    public int capacity() {
        return s.length;
    }

    public boolean isEmpty() {
        if (t < 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (this.size() == this.capacity()) {
            return true;
        }
        return false;
    }

    public void print() {
        Stack tmp = new Stack(this.capacity());
        while (!this.isEmpty()) {
            int x = this.pop();
            System.out.print(x + " ");
            tmp.push(x);
        }

        while (!tmp.isEmpty()) {
            int x = tmp.pop();
            this.push(x);
        }

    }



    public int search(int x){
        for (int i = 0; i < this.capacity(); i++){
            if(s[i] == x){
                return i;
            }


        }
        return -1;
    }
}
