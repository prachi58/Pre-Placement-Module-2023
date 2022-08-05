class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
 
        return solUtil(triangle,0,0);
    }
    
    public int solUtil(List<List<Integer>> triangle, int i,int j){
        
        if(i>=triangle.size()) return 0;
        
        int down=solUtil(triangle,i+1,j);
        int right=solUtil(triangle,i+1,j+1);

        return triangle.get(i).get(j) + Math.min(down,right);
    }
}