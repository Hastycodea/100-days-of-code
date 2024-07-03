import java.util.Arrays;

public class Day14 {
    public static void main(String[] args) {
        int[][] arrayValues = {
            {23, 45, 78, 12},
            {56, 90, 34, 67},
            {89, 21, 43, 76}
        };

        System.out.println(Arrays.toString(maxEachRow(arrayValues)));

    }

    public static int[] maxEachRow(int[][] arrayTwo) {
        int[] numbers= new int[arrayTwo.length];
        int k = 1;
        while(k < arrayTwo.length) {
            int max = arrayTwo[0][0];
            for(int i = 0; i < k; i++) {
                for(int j = 0; j < arrayTwo.length; j ++) {
                    if (arrayTwo[i][j] > max) {
                        max = arrayTwo[i][j];
                    }
                }
                int n = 0;
                while (n < arrayTwo.length) {
                    numbers[n] = max;
                }                
            }
        }

        return numbers;
    }
}
