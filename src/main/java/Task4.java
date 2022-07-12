/*
Given a string s consisting of words and spaces, return the length of the last word in the string.

        A word is a maximal substring consisting of non-space characters only.

        Input: s = "Hello World"
        Output: 5
        Explanation: The last word is "World" with length 5.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }

    public static int lengthOfLastWord(String s) {
        String[] s1 = s.split(" ");
        ArrayList<String> strList = new ArrayList<>();
        Collections.addAll(strList, s1);
        while(strList.contains("")) {
            strList.remove("");
        }
            return strList.get(strList.size() - 1).length();
    }
}

