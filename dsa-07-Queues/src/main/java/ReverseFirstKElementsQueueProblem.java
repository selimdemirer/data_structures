import java.util.Stack;

public class ReverseFirstKElementsQueueProblem {
    public static void main(String[] args) {
       MyQueue<Integer> queue=new MyQueue<>();
        for (int i = 0; i < 6; i++) {
            queue.enqueue(i);
        }
        System.out.println("Initial queue: ");
        queue.printQueue();
        System.out.println();
        System.out.println("After reverse");
        reverseFirstK(queue,3).printQueue();
    }
    static MyQueue<Integer> reverseFirstK(MyQueue<Integer> queue, int k){
        //create a stack
        Stack<Integer> stack=new Stack<>();
        // push first K elements into stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.dequeue());
        }
        // enqueue elements back into the queue
        while(!stack.isEmpty()){
            queue.enqueue(stack.pop());
        }
        // dequeue and enqueue size of queue -k times
        for (int i = 0; i < queue.size-k ; i++) {
            queue.enqueue(queue.dequeue());
        }
     return queue;
    }
}

/*

Problem:
Given an integer K and a queue of integers, write code to reverse the order
of the first K elements of the queue.
-Input: Q = [10, 20, 30, 40, 50], K = 4
-Output: Q = [40,30, 20, 10,50]

Hint: You can use stack to reverse the order of first K elements

Steps:
1. Create a stack
2. Push first K elements into stack
3. Pop stack k times and add to queue again
4. Dequeue and enqueue (n-k) times

 */