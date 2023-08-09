import java.util.Random;

public class ArrayGenerator {
    private ArrayGenerator() {}

    public static Integer[] generateOrderedArray(int n) {
        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = i;
        }

        return arr;
    }

    // generate an array with length n, each number is in the range of [0, bound)
    public static Integer[] generateRandomArray(int n, int bound) {
        Integer[] arr = new Integer[n];
        Random seed = new Random();

        for (int i = 0; i < n; ++i) {
            arr[i] = seed.nextInt(bound);
        }

        return arr;
    }
}
