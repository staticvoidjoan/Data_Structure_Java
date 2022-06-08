public class BinaryTree <Integer>{
    public Node root;

    public BinaryTree(Node root){
        this.root =root;
    }
    private void preorder(Node root){
        System.out.print(root.value + " ");
        if(root.left != null) preorder(root.left);
        if(root.right != null) preorder(root.right);
    }
    private void inorder(Node root){
        if(root.left != null) inorder(root.left);
        System.out.print(root.value + " ");
        if(root.right != null) inorder(root.right);
    }
    private void postorder(Node root){
        if(root.left != null) postorder(root.left);
        if(root.right != null) postorder(root.right);
        System.out.print(root.value + " ");
    }
    public void preorder(){
        System.out.println("Preorder:");
        preorder(root);
    }
    public void inorder(){
        System.out.println("Inorder:");
        inorder(root);
    }
    public void postorder(){
        System.out.println("Postorder: ");
        postorder(root);
    }

    private int sum(Node root){
        int leftSum = 0, rightSum = 0;
        if (root.left != null) leftSum += sum(root.left);
        if (root.right != null) rightSum += sum(root.right);
        return leftSum + rightSum + root.value;
    }
    public int sum(){
        return sum(root);
    }

    private int count(Node root){
        int c = 1;
        if (root.left != null) c += count(root.left);
        if (root.right != null) c += count(root.right);
        return c;
    }
    public int count(){
        return count(root);
    }

    private int leaves(Node root){
        int lcount = 0, rcount = 0;
        if (root.left == null && root.right == null){
            return 1;
        }
        if(root.left != null) lcount += leaves(root.left);
        if(root.right != null) rcount += leaves(root.right);
        return lcount + rcount;
    }
    public int leaves(){
        return leaves(root);
    }
    private int depth(Node root){
        int leftDepth = 0, rightDepth = 0;
        if (root.left == null && root.right == null){
            return 0;
        }
        if (root.left != null) leftDepth = depth(root.left);
        if (root.right != null) rightDepth = depth(root.right);
        if (leftDepth >= rightDepth){
            return leftDepth + 1;
        } else return rightDepth + 1;
    }

    public int depth(){
        return depth(root);
    }

    private int sumOfLeaves(Node root){
        int leftSum = 0, rightSum = 0;
        if (root.left == null && root.right == null){
            return 1;
        }
        if (root.left != null) leftSum = sumOfLeaves(root.left);
        if (root.right != null) rightSum = sumOfLeaves(root.right);
        return leftSum + rightSum;
    }
    public int sumOfLeaves(){
        return sumOfLeaves(root);
    }

    private Node invertTree(Node root){
        if (root == null){
            return null;
        }

        Node left = invertTree(root.left);
        Node right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    public Node invertTree(){
        return invertTree(root);
    }


}
