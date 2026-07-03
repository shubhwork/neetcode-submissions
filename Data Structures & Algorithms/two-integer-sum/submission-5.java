class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] result=new int[2];
      for(int i=0;i<nums.length-1;i++){
        int sum=nums[i];
        for(int j=i+1;j<nums.length;j++){
            sum+=nums[j];
            if(sum!=target){
                sum-=nums[j];
            }
            else{
                result[0]=i;
                result[1]=j;
                return result;
            }
        }
      } 
      return result; 
    }
}
