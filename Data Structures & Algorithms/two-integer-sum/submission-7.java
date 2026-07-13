class Solution {
    public int[] twoSum(int[] nums, int target) {
        int first=0;
        int second=0;
      for(int i=0;i<nums.length-1;i++){
        int currSum=nums[i];
        for(int j=i+1;j<nums.length;j++){
            int temp=target-nums[i];

            if(temp==nums[j]){
                first=i;
                second=j;
                return new int[]{first,second};
            }

        }
      }
      return new int[]{first,second};
    }
}
