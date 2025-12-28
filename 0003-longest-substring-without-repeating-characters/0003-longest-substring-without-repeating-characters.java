import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> lastIndex = new HashMap<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (lastIndex.containsKey(ch) && lastIndex.get(ch) >= left) {
                left = lastIndex.get(ch) + 1; 
            }

            lastIndex.put(ch, right);         
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
