// import java.util.Arrays;

class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int n = matrix.length;      // Row
        int m = matrix[0].length;     // Column     // Matrix- (R*C)

        for(int i=0; i<m; i++){
            int k=0;
            for(int j=0; j<n; j++){
                k = Math.max(k, matrix[j][i]);
            }
            for(int j=0; j<n; j++){
                if(matrix[j][i]==-1)
                matrix[j][i] =k;
            }
        }
        return matrix;
    }
}
