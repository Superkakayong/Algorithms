import java.util.Comparator;

public class SelectionSort {
    private SelectionSort() {}

    public static <E extends Comparable<E>> void sort(E[] arr) { // E must be comparable, so needs to extend Comparable interface
        for (int i = 0; i < arr.length; ++i) {
            // select the min value in [i, n)
            int minIndex = i;

            for (int j = i; j < arr.length; ++j) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            swap(arr, i, minIndex);
        }
    }

    private static <E> void swap(E[] arr, int i, int j) {
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 4, 2, 3, 6, 5};

        SelectionSort.sort(arr);

        for (int e : arr) {
            System.out.println(e + " ");
        }

        System.out.println();
    }
}
