import java.util.ArrayList;
import java.util.List;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int [][] array = {{5, 6, 3, 6, 1},
                          {5, 2, 6, 4, 3},
                          {6, 3, 2, 7, 7}};
        int [] colSumArray = computeColumnSum(array);
        int primaryDiagonalSum = computePrimaryDiagonalSum(array);
        int secondaryDiagonalSum = computeSecondaryDiagonalSum(array);
        int uniqueDiagonalSum = computeUniqueDiagonalSum(array);
        List<Integer> dominantColumns = findDominantColumns(array);

        // print out col sum
        System.out.print("Column Sums: ");
        for (int i = 0; i < colSumArray.length; i++) {
            System.out.print(colSumArray[i]);
            if (i < colSumArray.length - 1) System.out.print(" ");
        }
        System.out.println();
        System.out.println("primary diagonal sum: " + primaryDiagonalSum);
        System.out.println("secondary diagonal sum: " + secondaryDiagonalSum);
        System.out.println("unique diagonal sum: " + uniqueDiagonalSum);
        System.out.print("dominant column(s): [");
        for (int i = 0; i < dominantColumns.size(); i++) {
            System.out.print(dominantColumns.get(i));
            if (i < dominantColumns.size() - 1) System.out.print(" ");
        }
        System.out.println("]");
    }

    public static int[] computeColumnSum(int[][] array) {
        int[] sumArray = new int[array[0].length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                sumArray[j] += array[i][j];
            }
        }
        return sumArray;
    }

    public static int computePrimaryDiagonalSum(int[][] array) {
        int output = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (i == j) {
                    output += array[i][j];
                }
            }
        }
        return output;
    }

    public static int computeSecondaryDiagonalSum(int[][] array) {
        int output = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (j == array[0].length - 1 - i) {
                    output += array[i][j];
                }
            }
        }
        return output;
    }

    public static int computeUniqueDiagonalSum(int[][] array) {
        int output = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (i == j && j == array[0].length - 1 - i) output += array[i][j];
                else if (i == j ^ j == array[0].length - 1 - i) output += array[i][j];
            }
        }
        return output;
    }

    public static List<Integer> findDominantColumns(int[][] array) {
        int primaryDiagonal = computePrimaryDiagonalSum(array);
        int secondaryDiagonal = computeSecondaryDiagonalSum(array);
        int threshold = Math.max(primaryDiagonal, secondaryDiagonal);
        int[] colArray = computeColumnSum(array);
        List <Integer> dominantColumns = new ArrayList<>();

        for (int i = 0; i < colArray.length; i++) {
            if (colArray[i] > threshold) dominantColumns.add(i);
        }
        return dominantColumns;
    }
}
