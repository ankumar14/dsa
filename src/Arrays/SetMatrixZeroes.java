package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZeroes {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        System.out.println(matrix);
        System.out.println(setMatrixZeroes(matrix));
    }

    private static ArrayList<ArrayList<Integer>> setMatrixZeroes(ArrayList<ArrayList<Integer>> matrix) {//TC - O(n2)
        int[] row = new int[matrix.size()];
        int[] col = new int[matrix.get(0).size()];
        for (int i = 0; i < row.length; i++) {
            for (int j = i; j < col.length; j++) {
                if (matrix.get(i).get(j) == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < col.length; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix.get(i).set(j, 0);
                }
            }
        }
        return matrix;
    }

}
