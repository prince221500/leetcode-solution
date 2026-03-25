class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;

        long[] rowSums = new long[rows];
        long[] colSums = new long[cols];
        long totalSum = 0;

        for (int row = 0; row < rows; row++) {
            long rowSum = 0;
            for (int col = 0; col < cols; col++) {
                int val = grid[row][col];
                colSums[col] += val;
                rowSum += val;
            }
            rowSums[row] = rowSum;
            totalSum += rowSum;
        }

        if ((totalSum & 1) != 0) return false; 

        long halfSum = totalSum >> 1;

        return hasEqualPartitions(rowSums, halfSum)
               || hasEqualPartitions(colSums, halfSum);
    }

    private boolean hasEqualPartitions(long[] array, long halfSum) {
        long prefixSum = 0;
        for (int i = 0; prefixSum < halfSum; i++) {
            prefixSum += array[i];
        }
        return prefixSum == halfSum;
    }
}