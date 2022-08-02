class Solution {
    public void sortColors(int[] nums) {
        int C[] = {0, 0, 0};
        int N = nums.length;
        
        for (int i=0; i < N; i++) C[nums[i]] = C[nums[i]] + 1;
        
        int end_0 = C[0], end_1 = C[0] + C[1], end_2 = C[0] + C[1] + C[2];
        for (int i=0; i < end_0; i++) nums[i] = 0;
        for (int i=end_0; i < end_1; i++) nums[i] = 1;
        for (int i=end_1; i < end_2; i++) nums[i] = 2;
        
        System.out.println(Arrays.toString(nums));
    }
}