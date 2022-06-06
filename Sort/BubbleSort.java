package algorithms.sort;

import java.util.Arrays;

public class BubbleSort {

    public static int[] sort(int[] inputArray) {
        var outArray = Arrays.copyOf(inputArray, inputArray.length);
        for (int lastIndex = outArray.length - 1; lastIndex > 0; lastIndex--) {
            for (int i = 0; i < lastIndex; i++) {
                if (outArray[i] > outArray[i + 1]) Utils.swap(outArray, i, i+1);
            }
        }
        return outArray;
    }

    public static double[] sort(double[] inputArray) {
        var outArray = Arrays.copyOf(inputArray, inputArray.length);
        for (int lastIndex = outArray.length - 1; lastIndex > 0; lastIndex--) {
            for (int i = 0; i < lastIndex; i++) {
                if (outArray[i] > outArray[i + 1]) Utils.swap(outArray, i, i+1);
            }
        }
        return outArray;
    }

    public static <T extends Comparable<T>> T[] sort(T[] inputArray) {
        T[] outArray = Arrays.copyOf(inputArray, inputArray.length);
        for (int lastIndex = outArray.length - 1; lastIndex > 0; lastIndex--) {
            for (int i = 0; i < lastIndex; i++) {
                if (outArray[i].compareTo(outArray[i + 1]) > 0) Utils.swap(outArray, i, i+1);
            }
        }
        return outArray;
    }
}
