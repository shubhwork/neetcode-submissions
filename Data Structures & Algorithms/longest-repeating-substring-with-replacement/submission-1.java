class Solution {
    public int characterReplacement(String s, int k) {
        int maxLength=0;
        for(int i=0;i<s.length();i++){
            int[] arr=new int[26];
            int maxFreq=0;
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                    arr[ch-'A']++;
                    maxFreq=Math.max(maxFreq,arr[ch-'A']);
                    int windowLength=j-i+1;
                    int replacementNeeded=windowLength-maxFreq;
                    if(replacementNeeded<=k){
                        maxLength=Math.max(maxLength,windowLength);
                    }
             }

        }
        return maxLength;
    }
}
