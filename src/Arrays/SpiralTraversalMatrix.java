package Arrays;

// [1,2,3]   spiral         [1,2,3]
// [8,9,4] ------------->   [4,5,6]
// [7,6,5]   traversal      [7,8,9]
// Traverse : left to right to bottom to top multiple times
public class SpiralTraversalMatrix {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3,4,5,6}, {20,21,22,23,24,7}, {19,32,33,34,25,8},{18,31,36,35,26,9},{17,30,29,28,27,10},{16,15,14,13,12,11}};
        spiralTraversalMatrix(arr);
    }

    private static void spiralTraversalMatrix(int[][] arr) {
        int left = 0;
        int right = arr.length - 1;
        int bottom = arr[0].length - 1;
        int top = 0;
        while (left < right && top<bottom) {
            //left to right
            for (int i = left; i <=right; i++) {
                System.out.println(arr[top][i]);
            }
            top++;
            //right to bottom
            for (int i = top; i <= bottom; i++) {
                System.out.println(arr[i][right]);
            }
            right--;

            //bottom to left
            for (int i = right; i >= left; i--) {
                System.out.println(arr[bottom][i]);
            }
            bottom--;

            //bottom to top
            for (int i = bottom; i >= top; i--) {
                System.out.println(arr[i][left]);
            }
            left++;
        }
    }

}

