class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength=0;
        for(int i=0;i<s.length();i++){
            Set<Character> set=new HashSet<>();
            int currLength=0;
            for(int j=i;j<s.length();j++){
                char temp=s.charAt(j);
                if(set.contains(temp)){
                    break;
                }
                currLength++;
                set.add(temp);
                maxLength=Math.max(currLength,maxLength);
            }
        }
        return maxLength;
    }
}
