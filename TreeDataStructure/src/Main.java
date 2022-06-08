public class Main {
    public static BinaryTree createTree(){
        Node n1 = new Node(8);
        Node n2 = new Node(3);
        Node n3 = new Node(1);
        Node n4 = new Node(6);
        Node n5 = new Node(4);
        Node n6 = new Node(7);
        Node n7 = new Node(10);
        Node n8 = new Node(14);
        Node n9 = new Node(13);

        n1.left = n2;
        n1.right = n7;
        n2.left = n3;
        n2.right = n4;
        n4.left = n5;
        n4.right = n6;
        n7.right = n8;
        n8.left = n9;
        return new BinaryTree(n1);
    }

    public static void main(String[] args){

        BinaryTree tree = createTree();
        tree.preorder();
        System.out.println();
        tree.inorder();
        System.out.println();
        tree.postorder();
        tree.invertTree();
        System.out.println("\n****Inverted tree****");
        tree.preorder();
        System.out.println();
        System.out.println("Nodes : " + tree.count());
        System.out.println("Sum : " + tree.sum());
        System.out.println("Leaves : " + tree.leaves());
        System.out.println("Tree depth : " + tree.depth());
        System.out.println("Sum of leaves " + tree.sumOfLeaves());


    }

}
