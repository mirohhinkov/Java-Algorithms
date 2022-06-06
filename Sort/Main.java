package algorithms.sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Tests Arrays
        int[] intArray = { 5, -10, 30, -100, 1};

        double[] doubleArray = { 1.2, -5.3, 50.2, 12.7, -50.55 };

        // Array of wrapping Double objects
        Double[] doubleArrayWrap = new Double[doubleArray.length];
        Arrays.setAll(doubleArrayWrap, i -> doubleArray[i]);

        // Array of strings
        String[] strArray = { "A", "Z", "B", "Y"};

        // Array of objects
        Product[] productsArray = {
                new Product("Good one", 4.5),
                new Product("Very bad", 1.2),
                new Product("Not my dream", 2.2),
                new Product("Excellent", 5.0)
        };

        // Sorting array of integers
        System.out.println("Array of integers:");
        System.out.println("Unsorted: " + Arrays.toString(intArray));
        System.out.println("Bubble sort: " + Arrays.toString(BubbleSort.sort(intArray)));
        System.out.println("Selection sort: " + Arrays.toString(SelectionSort.sort(intArray)));

        //Sorting array of doubles
        System.out.println("Array of Doubles:");
        System.out.println("Unsorted: " + Arrays.toString(doubleArray));
        System.out.println("Bubble sort as doubles: " + Arrays.toString(BubbleSort.sort(doubleArray)));
        System.out.println("Bubble sort as Doubles: " + Arrays.toString(BubbleSort.sort(doubleArrayWrap)));
        System.out.println("Selection sort: " + Arrays.toString(SelectionSort.sort(doubleArray)));


        // Sorting Strings
        System.out.println("Array of strings:");
        System.out.println("Unsorted: " + Arrays.toString(strArray));
        System.out.println("Bubble sort: " + Arrays.toString(BubbleSort.sort(strArray)));
        System.out.println("Selection sort: " + Arrays.toString(SelectionSort.sort(strArray)));

        // Sorting Objects (have to implement Comparable interface)

        System.out.println("Array of comparable objects:");
        System.out.println("Unsorted: " + Arrays.toString(productsArray));
        System.out.println("Bubble sort: " + Arrays.toString(BubbleSort.sort(productsArray)));
        System.out.println("Selection sort: " + Arrays.toString(SelectionSort.sort(productsArray)));
    }
}
