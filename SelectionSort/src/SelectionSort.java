public class SelectionSort {
    private SelectionSort() {}

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            // select the min value in [i, n)
            int minIndex = i;

            for (int j = i; j < arr.length; ++j) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            swap(arr, i, minIndex);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 3, 6, 5};

        SelectionSort.sort(arr);

        for (int e : arr) {
            System.out.println(e + " ");
        }

        System.out.println();
    }
}
