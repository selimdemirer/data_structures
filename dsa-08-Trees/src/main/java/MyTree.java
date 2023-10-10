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





}
