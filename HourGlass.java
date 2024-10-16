public class HourGlass {
    public  int maxSumOfHourGlass(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int maxSum = 0;

        for (int i = 1 ; i+1 <n ; i++) {
            for (int j = 1 ; j+1 < m ; j++) {
                int sum =  grid[i][j]
                           + grid[i-1][j]
                           + grid[i+1][j]
                           + grid[i-1][j-1] + grid[i-1][j+1]
                           + grid[i+1][j-1] + grid[i+1][j+1];

                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        HourGlass hourglass = new HourGlass();
        int[][] grid = {
            {1, 2, 3, 0, 0},
            {0, 1, 0, 0, 0},
            {1, 2, 3, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0}
        };
        System.out.println( " max hour glass sum is  : " + hourglass.maxSumOfHourGlass(grid));
    }
}
