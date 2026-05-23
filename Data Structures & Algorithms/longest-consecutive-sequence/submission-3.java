class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int temp:nums){
            set.add(temp);
        }
        int maxCount=0;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int currCount=1;
                int currNum=nums[i];
                while(set.contains(currNum+1)){
                    currCount++;
                    currNum++;
                }
                maxCount=Math.max(maxCount,currCount);
            }
        }
        return maxCount;
        
    }
}
