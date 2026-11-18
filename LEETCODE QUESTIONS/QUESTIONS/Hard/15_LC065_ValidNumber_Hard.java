// LeetCode 65 - Valid Number
class Solution {
    public boolean isNumber(String s) {
        s = s.trim();
        boolean seenDigit = false, seenExponent = false, seenDecimal = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                seenDigit = true;
            } else if (c == '+' || c == '-') {
                if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E')
                    return false;
            } else if (c == '.') {
                if (seenDecimal || seenExponent) return false;
                seenDecimal = true;
            } else if (c == 'e' || c == 'E') {
                if (seenExponent || !seenDigit) return false;
                seenExponent = true;
                seenDigit = false;
            } else {
                return false;
            }
        }
        return seenDigit;
    }
}
