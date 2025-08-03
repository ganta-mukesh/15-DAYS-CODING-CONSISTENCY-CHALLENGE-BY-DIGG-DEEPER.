class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] newArr = new int[nums.length];
        int[] left_p=new int[nums.length];
        int[] right_p=new int[nums.length];
        left_p[0]=1;
        for(int i=1;i<nums.length;i++){
              left_p[i] = left_p[i - 1] * nums[i - 1];
        }
        right_p[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--){
              right_p[i] = right_p[i + 1] * nums[i + 1];
        }
        for(int i=0;i<nums.length;i++){
              newArr[i]=left_p[i]*right_p[i];
        }
        return newArr;
    }
}