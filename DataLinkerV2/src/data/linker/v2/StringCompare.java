package data.linker.v2;

import interfaces.ICompare;

public class StringCompare implements ICompare {

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        int len = s1.length();
        if (s1.length() > s2.length()) {
            len = s2.length();
        }

        for (int i = 0; i < len; i++) {

            if (s1.charAt(i) > s2.charAt(i)) {
                return -1;
            } else if (s1.charAt(i) == s2.charAt(i)) {

            } else {
                return 1;
            }
        }
        if (s2.length() != s1.length()) {
            if (s1.length() == len) {
                return 1;
            } else if (s2.length() == len) {
                return -1;
            }
        }
        return 0;
    }

}
