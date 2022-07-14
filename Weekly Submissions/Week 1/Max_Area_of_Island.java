class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if(grid.length == 0) return 0;
        int max = 0;
        for(int i =0; i< grid.length;i++){
            for(int j = 0; j< grid[0].length;j++){
                if(grid[i][j] == 1){
                    max = Math.max(max, helper(grid, i, j));
                }
            }
        }
        return max;
            
    }
    private int helper(int[][] grid, int i, int j){
        int r = grid.length;
        int c = grid[0].length;
        int count = 0;
        if(i < 0 || i >= r || j >= c || j <0 || grid[i][j] == 0 ){
            return count;
        }
        if(grid[i][j] == 1){
            grid[i][j] = 0;
            count = 1;
            count += helper(grid, i - 1, j);
            count += helper(grid, i + 1, j);
            count += helper(grid, i, j + 1);
            count += helper(grid, i, j - 1);
        }
        return count;
    }
}