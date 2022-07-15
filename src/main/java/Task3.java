/*
//Given a string s, find the length of the longest substring without repeating characters.
//Input: s = "abcabcbb"
//        Output: 3
//        Explanation: The answer is "abc", with the length of 3.
*/
public class Task3 {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));

    }

    public static int lengthOfLongestSubstring(String s) {
        int count = 0;
        int[] seen = new int[256];
        for (int i = 0, j = 0; j < s.length(); j++) {
            i = Math.max(i, seen[s.charAt(j)]);
            count = Math.max(count, j - i + 1);
            seen[s.charAt(j)] = j + 1;
        }
        return count;
    }
}


