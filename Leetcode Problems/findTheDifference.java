class Solution {
    public char findTheDifference(String s, String t) {
        char c = 0;
        for (int i = 0; i < s.length(); i++) {
            c ^= s.charAt(i);
            System.out.println(c);
        }
        for (int i = 0; i < t.length(); i++) {
            c ^= t.charAt(i);
        }
        System.out.println(c);
        return c;
    }
}