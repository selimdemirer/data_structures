public class TreeApp {

    public static void main(String[] args) {

        MyTree tree = new MyTree();

        int[] numbers = new int[] {10,6,8,20,4,9,5,17,42,47,29};
        for (int i = 0; i < 11; i++) {
            tree.insert(numbers[i]);
        }

        VisualizeTree.printTree(tree.root,null,false);

        System.out.println("Pre-Order Traversal of the Tree");
        tree.preOrderTraversal(tree.root);
        System.out.println();
        System.out.println("In-Order Traversal of the Tree");
        tree.inOrderTraversal(tree.root);
        System.out.println();
        System.out.println("Post-Order Traversal of the Tree");
        tree.postOrderTraversal(tree.root);
        System.out.println();
        System.out.println("Level Order Traversal of the Tree ");
        tree.levelOrderTraversal();
        System.out.println();
        System.out.println("Tree contains 42: "+ tree.contains(42));
        System.out.println("Node is a leaf node is : " + tree.isLeaf(tree.root.leftChild.rightChild.rightChild));
        tree.printLeaves(tree.root);
        tree.printLeaves(tree.root);
        System.out.println("Height of the tree is: " + tree.height(tree.root));
        System.out.println("Number of leaves:  " + tree.countLeaves(tree.root));
        System.out.println("Sum of Leaf Nodes: " + tree.findSumOfLeaves(tree.root));

    }
}
