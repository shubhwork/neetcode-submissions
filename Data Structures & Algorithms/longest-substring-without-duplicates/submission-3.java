class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxCount=0;
        for(int i=0;i<s.length();i++){
          Set<Character> set=new HashSet<>();
          int currCount=0;
          for(int j=i;j<s.length();j++){
            char temp=s.charAt(j);
            if(set.contains(temp)){
              break;
            }
            currCount++;
            set.add(temp);

          }
          maxCount=Math.max(currCount,maxCount);
        }
        return maxCount;
    }
}
