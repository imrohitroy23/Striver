class longestPalindromicString {
    public String longestPalin(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            String s1 = ex(s, i, i);
            String s2 = ex(s, i, i + 1);
            String t = (s1.length() > s2.length()) ? s1 : s2;
            res = (t.length() > res.length()) ? t : res;
        }
        return res;
    }

    String ex(String s, int st, int end) {
        while ((st > -1 && end < s.length()) && s.charAt(st) == s.charAt(end)) {
            st--;
            end++;
        }
        return s.substring(st + 1, end);

    }
}