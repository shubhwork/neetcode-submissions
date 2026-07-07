class Solution {
    public int characterReplacement(String s, int k) {
      int n = s.length();

        int maxLength = 0;

        for (int i = 0; i < n; i++) {

            int[] freq = new int[26];

            int maxFreq = 0;

            for (int j = i; j < n; j++) {

                char ch = s.charAt(j);

                freq[ch - 'A']++;

                maxFreq = Math.max(maxFreq, freq[ch - 'A']);

                int windowLength = j - i + 1;

                int replacementsNeeded = windowLength - maxFreq;

                if (replacementsNeeded <= k) {

                    maxLength = Math.max(maxLength, windowLength);

                }

            }

        }
        return maxLength;  
    }
}
