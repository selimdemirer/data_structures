public class KthLargest {
    public static void main(String[] args) {
        int[] numbers={3,2,1,5,6,4};
        System.out.println(getKthLargest(numbers, 2));
    }
    public static int getKthLargest(int[] array, int k){

        // create a heap
        MyHeap heap=new MyHeap(array.length);
        // put array into a heap
        for (int i = 0; i < array.length; i++) {
          heap.insert(array[i]);
        }
        // remove root(because it is largest) k-1 times
        for (int i = 0; i <k-1 ; i++) {
            heap.remove();
        }
        // return root
        return heap.peek();
    }
}
/*
Problem: Kth Largest Element in an Array

Medium
• Given an integer array nums and an integer k, return the kth largest element in the array.
• Note that it is the kth largest element in the sorted order, not the kth distinct element.

Example 1:
• Input: nums = [3,2,1,5,6,4], k = 2 Output: 5
Example 2:
• Input: nums = [3,2,3,1,2,4,5,5,6], k = 4 Output: 4

Constraints:
• 1 <= k <= nums.length <= 104
• -104 <= nums[i] <= 104

Solution:

Approach #1: done
1. Put array into a heap/Priority Queue
2. Remove operation k-1 times.
3. Return root of the heap.

Approach #2:
1. Sort array descending
2. Return (k-1) th element

Approach #3:
1. Quicksort
2. Return when pivot is placed in (k-1)th position

 */