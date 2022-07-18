class Solution {
    public void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void permutations(int[] nums,int l,int r,List<List<Integer>> res,List<Integer> lis)
    {
        if(l==r)
        {
            for(int i=0;i<nums.length;i++)
                lis.add(nums[i]);
            res.add(new ArrayList<>(lis));
            lis.clear();
            return;
        }
        for(int i=l;i<r;i++)
        {
            swap(nums,l,i);
            permutations(nums,l+1,r,res,lis);
            swap(nums,l,i);
        }
        
    }
    public List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> lis=new ArrayList<>();
        permutations(nums,0,nums.length,res,lis);
        return res;
    }
}