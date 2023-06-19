import java.lang.reflect.Array;

public class LinearSearch {
    private LinearSearch() {}

    public static <E> int search(E[] data, E target) {
        for (int i = 0; i < data.length; ++i) {
            if (data[i].equals(target)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Integer[] data = {24, 18, 12, 9, 32, 4};

        int res = LinearSearch.search(data, 12);
        System.out.println(res);

        int res2 = LinearSearch.search(data, 122);
        System.out.println(res2);

        Student[] students = {new Student("Kaka"), new Student("Erling"), new Student("CR7")};
        Student me = new Student("kaka");

        int res3 = LinearSearch.search(students, me);
        System.out.println(res3);

        // code below is for algorithm efficiency test
        int n = 1000000;
        Integer[] testData = ArrayGenerator.generateOrderedArray(n);

        long start = System.nanoTime();
        LinearSearch.search(testData, n);
        long end = System.nanoTime();

        double time = (end - start) / 1000000000.0; // convert nano sec to sec
        System.out.println(time + "s");
    }
}
