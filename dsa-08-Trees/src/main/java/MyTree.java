import java.util.LinkedList;
import java.util.Queue;

public class MyTree {

    TNode root;

    public MyTree() {
    }

    void insert(int value){

        TNode newNode = new TNode(value);

        if(root == null){
            root=newNode;
            return;
        }

        TNode current = root;

        while (true){
            if (value <= current.value){
                if (current.leftChild==null){ // if left is null insert there!
                    current.leftChild=newNode;
                    break;
                }
                current=current.leftChild; // if left is not null branch left subtree!
            }else{
                if (current.rightChild==null){
                    current.rightChild=newNode;
                    break;
                }
                current=current.rightChild;
            }
        }
    }

    // Root - Left - Right
    void preOrderTraversal(TNode root){

        if(root==null) return; // termination! // first step of designing recursive algorithm is this
        System.out.print(root.value+", "); // visit root
        preOrderTraversal(root.leftChild); // visit left subtree //recursive call
        preOrderTraversal(root.rightChild); // visit right subtree //recursive call

    }

    // Left - Root - Right
    void inOrderTraversal(TNode root){ // output should be in Asc order

        if (root==null) return; // termination!
        inOrderTraversal(root.leftChild);
        System.out.print(root.value+", ");
        inOrderTraversal(root.rightChild);

    }

    void postOrderTraversal(TNode root){

        if (root==null) return;// termination
        postOrderTraversal(root.leftChild); // branch and finish left subtree
        postOrderTraversal(root.rightChild); // branch and finish right subtree
        System.out.print(root.value+", ");  // visit root

    }

    void levelOrderTraversal(){ // This is not a recursive method! Because I use Queue and While Loop, so it is already iterable method

        if(root==null) return;
        Queue<TNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TNode toVisit=queue.poll();
            System.out.print(toVisit.value+", ");
            if (toVisit.leftChild!=null) queue.add(toVisit.leftChild);
            if (toVisit.rightChild!=null) queue.add(toVisit.rightChild);
        }

    }

    // Task 1- Implement contains(int value)
    public boolean contains(int value) {
        if (root==null) return false;
        // start from root with current
        TNode current=root;
        while (current!=null){
            if (value<current.value){
                current=current.leftChild; // branch left subtree
            }else if (value>current.value){
                current=current.rightChild;   // branch right subtree
            }else return true;
        }
        return false;
    }

    // Task-2 Implement isLeaf(TNode node)
    public boolean isLeaf(TNode node) {
        // if left child and right child are null it is a leaf
        return node.leftChild==null && node.rightChild==null;
    }

    // Task-3 Implement printLeaves(TNode node)
    public void printLeaves(TNode root) {
        // make a traversal, if current node is a leaf print it
        if (root==null) return;
        printLeaves(root.leftChild);  // Left subtree -> Right subtree-> root ==> post-order traversal
        printLeaves(root.rightChild);
        if (isLeaf(root)) System.out.print(root.value+ " =>");
    }


}
