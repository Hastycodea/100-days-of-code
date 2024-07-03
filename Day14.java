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

    }

    public static int[] maxEachRow(int[][] arrayTwo) {
        int[] numbers = new int[arrayTwo.length];
        for (int i = 0; i < arrayTwo.length; i++) {
            int max = arrayTwo[i][0];
            for (int j = 0; j < arrayTwo[i].length; j++) {
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

        for(int i = 0; i < arrayMaxCol[0].length; i++) { // iterating over the colums
            int max = arrayMaxCol[0][i];
            for(int j = 0; j < arrayMaxCol.length; j++) { // iterating over the rows
                if (arrayMaxCol[j][i] > max) {
                    max = arrayMaxCol[j][i];
                }
            }
            numbers[i] = max;
        }
        return numbers; 
    }
}
