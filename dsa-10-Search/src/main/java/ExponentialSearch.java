public class ExponentialSearch {

    public static void main(String[] args) {

        int[] numbers=new int[30];
        for (int i = 0; i < 30; i++) {
            numbers[i]=i;
        }
        System.out.println(exponentialSearch(numbers, 31));

    }

    public static int exponentialSearch(int[] array, int data){

        int bound=1; //starting index
        while (bound<array.length && array[bound]<data) bound*=2;

        int left=bound/2;
        int right=Math.min(bound, array.length-1);
        return BinarySearch.binarySearchRecursive(array, data, left,right);

    }

}