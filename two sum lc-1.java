class Solution {
    public int[] twoSum(int[] nums, int target) {
        int temp=0;
         for(int i=0;i<nums.length;i++)
         {
             temp=target - nums[i];
             for(int j=0;j<nums.length & j!=i;j++)
             {
                  if(nums[j]==temp)
                  {return new int[] {i,j};}
                  
             }
         } 
         return new int[] {};
    }
}