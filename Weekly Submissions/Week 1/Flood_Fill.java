class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalCol=image[sr][sc];
        return fill(image, sr, sc, color, originalCol);
    }
    
    public int[][] fill(int[][] image, int row, int col, int color, int OCol){
        
        if(color==OCol) return image;
        if(col<0 || row < 0 || row==image.length || col==image[0].length) return image;
        if(image[row][col]!=OCol) return image;
        
        image[row][col]=color;
            
        fill(image, row, col+1, color, OCol);
        fill(image, row, col-1, color, OCol);
        fill(image, row-1, col, color, OCol);
        fill(image, row+1, col, color, OCol);
        return image;
    }
}