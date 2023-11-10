import java.util.Arrays;

public class SortingMain {

    public static void main(String[] args) {

        System.out.println("ARRAY WITHOUT SORTING");
        int[] numbers= {7,2,4,6,1,9,-1};

        System.out.println(Arrays.toString(numbers));
        System.out.println("SELECTION SORT");
        System.out.println(Arrays.toString(SelectionSort.selectionSort(numbers)));
        System.out.println("BUBBLE SORT");
        System.out.println(Arrays.toString(BubbleSort.bubbleSort(numbers)));
        System.out.println("MERGE SORT");
        System.out.println(Arrays.toString(JD1MergeSort.mergeSort(numbers)));
        System.out.println("QUICK SORT");
        System.out.println(Arrays.toString(JD1QuickSort.qSort(numbers, 0, numbers.length-1)));

        //Performance Order: Selection < Bubble <

    }
}
