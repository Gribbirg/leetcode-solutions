package code.java;

import java.util.ArrayList;
import java.util.List;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {

        int[] sChars = new int[128];
        int[] tChars = new int[128];

        for (int i = 0; i < s.length(); i++) {
            if (sChars[s.charAt(i)] != tChars[t.charAt(i)])
                return false;

            sChars[s.charAt(i)] = i + 1;
            tChars[t.charAt(i)] = i + 1;
        }

        return true;
    }

    public static void main(String[] args) {
        var sol = new IsomorphicStrings();
        System.out.println(sol.isIsomorphic("egg", "add"));
        System.out.println(sol.isIsomorphic("foo", "bar"));
        System.out.println(sol.isIsomorphic("paper", "title"));
    }
}
