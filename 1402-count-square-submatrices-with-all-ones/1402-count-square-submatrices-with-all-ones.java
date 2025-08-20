class Solution {
    public int countSquares(int[][] matrix) {
        int n = 0; 
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    int a = (i == 0) ? 0 : matrix[i - 1][j];
                    int b = (j == 0) ? 0 : matrix[i][j - 1];
                    int c = (i == 0 || j == 0) ? 0 : matrix[i - 1][j - 1];

                    matrix[i][j] += Math.min(Math.min(a, b), c);
                    n += matrix[i][j];
                }
            }
        }
        return n;
    }
}