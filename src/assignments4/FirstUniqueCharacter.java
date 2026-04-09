package Module8;

import java.util.*;

public class FirstUniqueCharacter {

    public static int firstUniqChar(String s) {

        int[] freq = new int[26];

        for(char c : s.toCharArray())
            freq[c-'a']++;

        for(int i=0;i<s.length();i++)
            if(freq[s.charAt(i)-'a']==1)
                return i;

        return -1;
    }

    public static void main(String[] args) {

        String s="leetcode";

        System.out.println(firstUniqChar(s));
    }
}
