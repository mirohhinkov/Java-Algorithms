package algorithms.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        // Tests
        // Sorting array of integers
        System.out.println("Array of integers:");
        int[] intArray = { 5, -10, 30, -100, 1};
        System.out.println(Arrays.toString(bubbleSort(intArray)));

        //Sorting array of doubles
        System.out.println("Array of Doubles:");
        double[] doubleArray = { 1.2, -5.3, 50.2, 12.7, -50.55 };
        System.out.println(Arrays.toString(bubbleSort(doubleArray)));

        // Sorting Objects (have to implement Comparable interface)
        Product[] productsArray = {
                new Product("Good one", 4.5),
                new Product("Very bad", 1.2),
                new Product("Not my dream", 2.2),
                new Product("Excellent", 5.0)
        };
        System.out.println(Arrays.toString(bubbleSort(productsArray)));
    }

    public static int[] bubbleSort(int[] inputArray) {
        var outArray = Arrays.copyOf(inputArray, inputArray.length);
        for (int lastIndex = outArray.length - 1; lastIndex > 0; lastIndex--) {
            for (int i = 0; i < lastIndex; i++) {
                if (outArray[i] > outArray[i + 1]) swap(outArray, i, i+1);
            }
        }
        return outArray;
    }

    public static double[] bubbleSort(double[] inputArray) {
        var outArray = Arrays.copyOf(inputArray, inputArray.length);
        for (int lastIndex = outArray.length - 1; lastIndex > 0; lastIndex--) {
            for (int i = 0; i < lastIndex; i++) {
                if (outArray[i] > outArray[i + 1]) swap(outArray, i, i+1);
            }
        }
        return outArray;
    }

    public static <T extends Comparable<T>> T[] bubbleSort(T[] inputArray) {
        T[] outArray = Arrays.copyOf(inputArray, inputArray.length);
        for (int lastIndex = outArray.length - 1; lastIndex > 0; lastIndex--) {
            for (int i = 0; i < lastIndex; i++) {
                if (outArray[i].compareTo(outArray[i + 1]) > 0) swap(outArray, i, i+1);
            }
        }
        return outArray;
    }


    private static void swap(int[] array, int i, int j) {
        var temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void swap(double[] array, int i, int j) {
        var temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static <T extends Comparable<T>> void swap(T[] array, int i, int j) {
        var temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }



}
