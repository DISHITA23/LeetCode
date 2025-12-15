class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int c2=nums[0];
        
        for(int i =1;i<nums.length;i++)
        {
            c2=Math.max(nums[i],nums[i]+c2);
            max=Math.max(c2,max);
        }
        return max;
    }
}
