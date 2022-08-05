class Solution {
    public int[][] generateMatrix(int n) {
       int[][] ans=new int[n][n];
       
        int rowBegin=0;
        int rowEnd=n-1;
        int columnBegin=0;
        int columnEnd=n-1;
        int counter=0;
      
        while(rowBegin<=rowEnd && columnBegin<=columnEnd && counter<=n*n){
            
            for(int i=columnBegin;i<=columnEnd;i++){
                counter++;
                ans[rowBegin][i]=counter;
            }
            rowBegin++;
            for(int i=rowBegin;i<=rowEnd;i++){
                counter++;
                ans[i][columnEnd]=counter;
            }
            columnEnd--;
            if(rowBegin<=rowEnd){
                for(int i=columnEnd;i>=columnBegin;i--){
                counter++;
                ans[rowEnd][i]=counter;
            }
           
            }
             rowEnd--;
            if(columnBegin<=columnEnd){
                for(int i=rowEnd;i>=rowBegin;i--){
                counter++;    
                ans[i][columnBegin]=counter;
            }
            
            }
            columnBegin++;
           
        }
        
        return ans;
    }
}