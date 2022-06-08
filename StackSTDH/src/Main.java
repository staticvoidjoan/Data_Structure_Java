public class Main {
    public static  Stack stiva1 = new Stack(3);



    public static void main(String[] args){
        int x;
        stiva1.push(10);
        stiva1.push(20);
        stiva1.push(30);
        stiva1.push(40);

        x = stiva1.pop();
        System.out.println(x);
        x =stiva1.pop();
        System.out.println(x);
        x = stiva1.peek();
        System.out.println(x);
        stiva1.print();
        x = stiva1.pop();
        System.out.println(x);
        x = stiva1.pop();
        System.out.println(x);


    }


}
