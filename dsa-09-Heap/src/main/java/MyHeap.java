public class MyHeap {

    int[] items;
    int size;

    public MyHeap(int capacity) {
        this.items = new int[capacity];
        this.size = 0;
    }



    public int leftChildIndex(int index){ return index*2 +1;} // Apparent Index will be sent to this method and as a return I am gonna get the left child address
    public int rightChildIndex(int index){ return index*2 +2;} // Apparent Index will be sent to this method and as a return I am gonna get the right child address
    public int parentIndex(int index) { return (index-1)/2;} // Child Index will be sent to this method and as a return I am gonna get the parent address

    public boolean hasLeftChild(int index){ return  leftChildIndex(index)<size;}
    public boolean hasRightChild(int index){ return  rightChildIndex(index)<size;}

    public int largerChildIndex(int index) {

        if (!hasLeftChild(index)) return index; // no child

        else if (!hasRightChild(index)) {
            return leftChildIndex(index); // one child - left
        }
        return items[leftChildIndex(index)]>items[rightChildIndex(index)] ? leftChildIndex(index):rightChildIndex(index); // which one is greater?

    }

    public void swap(int first, int second){
        int temp=items[first];
        items[first]=items[second];
        items[second]=temp;
    }



}



