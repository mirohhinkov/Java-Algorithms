package algorithms.sort;

import java.util.Arrays;

public class SelectionSort {
    public static int[] sort(int[] inputArray) {
        var outArray = Arrays.copyOf(inputArray, inputArray.length);
        for (int lastUnsortedIndex = outArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int indexOfLargest = 0;

            for (int i = 0; i <= lastUnsortedIndex; i++) {
                if (outArray[i] > outArray[indexOfLargest]) indexOfLargest = i;
            }
            Utils.swap(outArray, indexOfLargest, lastUnsortedIndex);
        }
        return outArray;
    }

    public static double[] sort(double[] inputArray) {
        var outArray = Arrays.copyOf(inputArray, inputArray.length);
        for (int lastUnsortedIndex = outArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int indexOfLargest = 0;

            for (int i = 0; i <= lastUnsortedIndex; i++) {
                if (outArray[i] > outArray[indexOfLargest]) indexOfLargest = i;
            }
            Utils.swap(outArray, indexOfLargest, lastUnsortedIndex);
        }
        return outArray;
    }

    public static <T extends Comparable<T>> T[] sort(T[] inputArray) {
        var outArray = Arrays.copyOf(inputArray, inputArray.length);
        for (int lastUnsortedIndex = outArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int indexOfLargest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (outArray[i].compareTo(outArray[indexOfLargest]) > 0) indexOfLargest = i;
            }
            Utils.swap(outArray, indexOfLargest, lastUnsortedIndex);
        }
        return outArray;
    }
}
