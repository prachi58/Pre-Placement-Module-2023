class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int row[]={1,-1,0,0};
        int col[]={0,0,1,-1};
        int ans[][]=new int[n][m];
        Queue<pair> q=new LinkedList<>();
        for(int r[]:ans){
            Arrays.fill(r,Integer.MAX_VALUE);
        }
		
		// adding coordinates of cell having rottten oranges in the queue.
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new pair(i,j));
                    ans[i][j]=0;
                }
            }
        }
		// relaxing all adjacent vertices
        while(!q.isEmpty()){
            pair p=q.remove();
            for(int i=0;i<4;i++){
                int a=p.x+row[i];
                int b=p.y+col[i];
                if(a<0 || b<0 || a>=n || b>=m || grid[a][b]==0)continue;
                if(ans[a][b]>ans[p.x][p.y]+1){
                    ans[a][b]=ans[p.x][p.y]+1;
                    q.add(new pair(a,b));
                }
            }
        }
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
				// if ans==int-max ,means we cannot reach that fresh oranges.
                    if(ans[i][j]==Integer.MAX_VALUE)return -1;
                    res=Math.max(res,ans[i][j]);
                }
            }
        }
        return res;
    }
    class pair{
         int x;
        int y;
        pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
}