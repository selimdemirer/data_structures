public class JumpSearch {

    public static void main(String[] args) {
        int[] numbers=new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i]=i;
        }
        System.out.println(jumpSearch(numbers, 6));

    }

    public static int jumpSearch(int[] array, int data){

        int blockSize=(int)Math.sqrt(array.length);
        int start=0;
        int next=blockSize;
        while (start< array.length && array[next-1]<data){
            start=next;
            next+=blockSize;
            if (next> array.length) next= array.length;
        }
        for (int i = start; i <next ; i++) {
           if (array[i]==data) return i;
        }
        return -1;

    }

}