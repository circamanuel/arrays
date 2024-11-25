package dev.Ipa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Initialize and populate an integer array
        int[] myIntArray = new int[10];
        myIntArray[0] = 1;
        myIntArray[1] = 2;
        myIntArray[2] = 3;

        // Initialize and populate a double array
        double[] myDoubleArray = new double[10];
        myDoubleArray[0] = 0.5;
        myDoubleArray[1] = 0.5;
        System.out.println(myDoubleArray[1]);

        // Using an array literal to initialize an array
        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(firstTen[firstTen.length - 1]); // Accessing the last element
        int arrayLength = firstTen.length;
        System.out.println("Array Length: " + arrayLength);

        // Creating a new array and filling it using a loop
        int[] newArray = new int[5]; // Initializing with size 5
        for (int i = 0; i < newArray.length; i++) {
            // Filling the array with values based on index (example: reverse order)
            newArray[i] = newArray.length - i;
        }

        // Printing the new array
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
        for (int element : newArray) {
            System.out.print(element + " ");
        }
        System.out.println();
       System.out.println(Arrays.toString(newArray));
       Object objectVariable = newArray;
       if (objectVariable instanceof int[]) {
           System.out.println("objectVariable is really an int array");
       }

       Object[] objectArray = new Object[3];
       objectArray[0] = "Hello";
       objectArray[1] = new StringBuilder("World");
       objectArray[2] = newArray;
    }
}
