package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfDiagonalElements {
    public static int[][] create2DArray(int row, int col) {
        int[][] array = new int[row][col];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter element array[" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
                System.out.println("");
            }
        }
        System.out.println(Arrays.deepToString(array));
        return array;
    }

    public static int getSumOfDiagonalElements(int[][] input){
        int sum=0;
        for (int i=0;i<input.length;i++){
            for (int j=0;j<input[0].length;j++){
                if(i==j){
                    sum = sum + input[i][j];
                }
            }
        }
        System.out.println("Sum of Diagonal Elements of the array : " + sum);
        return sum;
    }

    public static void main(String[] args) {
        getSumOfDiagonalElements(create2DArray(3, 3));
    }
}
