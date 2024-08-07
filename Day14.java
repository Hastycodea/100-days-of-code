import java.util.Arrays;

public class Day14 {
    public static void main(String[] args) {
        int[][] arrayValues = {
                { 23, 45, 78, 12 },
                { 56, 90, 34, 67 },
                { 89, 21, 43, 76 }
        };

        System.out.println(Arrays.toString(maxEachRow(arrayValues)));
        System.out.println(Arrays.toString(maxEachColumn(arrayValues)));

        for (int i = 0; i < arrayValues.length; i++) {
            for (int j = 0; j < arrayValues[i].length; j++) {
                System.out.print(arrayValues[i][j] + " ");
            }
            System.out.println();
        }

        int[][] transformedArray = transformArray(arrayValues);
        for (int i = 0; i < transformedArray.length; i++) {
            for (int j = 0; j < transformedArray[i].length; j++) {
                System.out.print(transformedArray[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[] maxEachRow(int[][] arrayTwo) {
        int[] numbers = new int[arrayTwo.length];
        for (int i = 0; i < arrayTwo.length; i++) { // iterating over the rows
            int max = arrayTwo[i][0]; // initializing max with 1st element of the current row
            for (int j = 0; j < arrayTwo[i].length; j++) { // iterating of over the colums of the current row
                if (arrayTwo[i][j] > max) {
                    max = arrayTwo[i][j];
                }
            }

            numbers[i] = max;
        }

        return numbers;
    }

    public static int[] maxEachColumn(int[][] arrayMaxCol) {
        int[] numbers = new int[arrayMaxCol[0].length];

        for (int i = 0; i < arrayMaxCol[0].length; i++) { // iterating over the columns
            int max = arrayMaxCol[0][i];
            for (int j = 0; j < arrayMaxCol.length; j++) { // iterating over the rows
                if (arrayMaxCol[j][i] > max) {
                    max = arrayMaxCol[j][i];
                }
            }
            numbers[i] = max;
        }
        return numbers;
    }

    public static int[][] transformArray(int[][] firstArray) {
        int[][] secondArray = new int[firstArray[0].length][firstArray.length];

        for (int i = 0; i < firstArray.length; i++) { // iterating over rows
            for (int j = 0; j < firstArray[0].length; j++) {
                int value = firstArray[i][j];
                secondArray[j][i] = value;
            }
        }
        return secondArray;
    }
}
