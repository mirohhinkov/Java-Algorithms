package algorithms.sort;

public class Utils {
    public static void swap(int[] array, int i, int j) {
        if (i == j) return;
        var temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void swap(double[] array, int i, int j) {
        if (i == j) return;
        var temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static <T extends Comparable<T>> void swap(T[] array, int i, int j) {
        if (i == j) return;
        var temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
