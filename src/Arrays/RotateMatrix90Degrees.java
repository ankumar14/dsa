package Arrays;
//Condition : Matrix should be n*n
//Step 1 : Transpose the matrix (means first row becomes first column and so on )
//Step 2 : Reverse every row of the transposed matrix

import java.util.ArrayList;
import java.util.Arrays;

//[1,2,3]   Transpose  [1,4,7] reverse rows [7,4,1]
//[4,5,6] ------------>[2,5,8] ------------>[8,5,2]
//[7,8,9]              [3,6,9]              [9,6,3]
public class RotateMatrix90Degrees {
    static int[][] rotate(int[][] matrix) {

        int n = matrix.length;
        //Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //Reverse Rows
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }

        return matrix;
    }

    public static void main(String args[]) {
        int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(rotate(arr)));
        System.out.println("Rotated Image");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
