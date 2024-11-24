package dev.Ipa;

public class Main {

    public static void main(String[] args) {

        int[] myIntArray = new int[10];
        myIntArray[0] = 1;
        myIntArray[1] = 2;
        myIntArray[2] = 3;

        double[] myDoubleArray = new double[10];
        myDoubleArray[0] = 0.5;
        myDoubleArray[1] = 0.5;
        System.out.println(myDoubleArray[1]);

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(firstTen[firstTen.length - 1]);
        int arrayLength = firstTen.length;
        System.out.println("Array Length: " + arrayLength);

        int[] newArray;
        newArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
