class Solution {
    public int longestConsecutive(int[] nums) {
        int result=1;
        if(nums.length==0)return 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            int currNum=nums[i];
            int length=1;
            for(int j=i+1;j<nums.length;j++){
                if(currNum+1==nums[j]){
                    length++;
                    currNum=nums[j];
                    result=Math.max(result,length);
                }
                else if(currNum==nums[j]){
                    continue;
                }
                else{
                    break;
                }
            }
        }
        return result;
    }
}
