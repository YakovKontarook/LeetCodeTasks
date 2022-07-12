
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
        char[] charArray = s.toCharArray();
        StringBuffer sb = new StringBuffer(s);
        int counter = charArray.length;
        int max = 0;
        for (int i = 0; i < counter - 1; i++) {
            int deleteChar = sb.lastIndexOf(String.valueOf(sb.charAt(i)));
            while (deleteChar != -1 && deleteChar != i) {
                sb.deleteCharAt(deleteChar);
                counter -= 1;
                deleteChar = sb.lastIndexOf(String.valueOf(sb.charAt(i)));
            }
        }
        return sb.length();
    }
}


