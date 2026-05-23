class Solution {
    public String longestPalindrome(String s) {
        int left=0;
        int right=0;
       for(int i=0;i<s.length();i++){
        int len1=expandAroundCenter(s,i,i);
        int len2=expandAroundCenter(s,i,i+1);
        int len=Math.max(len1,len2);
        if(len>right-left+1){
            left=i-(len-1)/2;
            right=i+len/2;
        }
       } 
       return s.substring(left,right+1);
    }
    public static int expandAroundCenter(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}
