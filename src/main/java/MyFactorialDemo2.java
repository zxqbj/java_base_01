import java.util.Arrays;
import java.util.stream.IntStream;

public class MyFactorialDemo2 {
    public static void main(String[] args) {
        int[] arrNum = {4, 8, 5, 2, 3, 6, 9, 7, 1, 10};
        Arrays.sort(arrNum);
        System.out.println(Arrays.toString(arrNum));

        int index = Arrays.binarySearch(arrNum, 8);
        System.out.println(index);
    }

}
