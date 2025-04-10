package LeetCode;

public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for (int layer = 0; layer < n / 2; layer++) {
            for (int j = layer; j < n - 1 - layer  ; j++) {
                int top = matrix [layer][j];

                matrix [layer][j] = matrix[n - 1 - j][layer];

                matrix[n -1 -j] [layer] = matrix[n - 1 - layer][n - 1 - j];

                matrix [n - 1 - layer][n - 1 - j] = matrix [j] [n - 1 -layer];

                matrix[j] [n-1-layer] = top;

            }
        }


    }
}


//  00   30
//  30  33
//  33  03
//  03  00