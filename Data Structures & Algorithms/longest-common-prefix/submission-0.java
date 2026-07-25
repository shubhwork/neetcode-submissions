class Solution {
    public String longestCommonPrefix(String[] strs) {
       String longest=strs[0];
       for(int i=1;i<strs.length;i++){
        while(!strs[i].startsWith(longest)){
            longest=longest.substring(0,longest.length()-1);
        if(longest.length()==0){
            return "";
            }
            }
       } 
       return longest;
    }
}