class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int result=0;
        for(int num:nums)set.add(num);
        for(int num:nums){
            if(!set.contains(num-1)){
                int length=1;
                int current=num;
                while(set.contains(current+1)){
                    length++;
                    current++;
                }
                result=Math.max(length,result);
            }
        }
        return result;
    }
}
