public class LinearSearch { // It is also called Sequential Search

    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = i;
        }
        System.out.println(linearSearch(numbers,6));
    }

    public static int linearSearch(int[] array, int data) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == data) return i;
        }
        return -1;
    }

}