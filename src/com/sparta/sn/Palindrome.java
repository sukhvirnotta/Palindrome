package com.sparta.sn;

public class Palindrome {
    public boolean isPalindrome(String string) {
        if (string == null || string.isEmpty()) {
            return false;
        } else {
            string = string.toLowerCase();
            int length = string.length();
            int start = 0;
            int end = length - 1;
            while (end > start) {
                if (string.charAt(start) != string.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}
