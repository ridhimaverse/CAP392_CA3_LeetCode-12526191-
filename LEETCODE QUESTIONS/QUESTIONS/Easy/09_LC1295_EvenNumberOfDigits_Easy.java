// LeetCode 1295 - Find Numbers with Even Number of Digits
class Solution {
    public int findNumbers(int[] nums) {
        int answer = 0;
        for (int num : nums) {
            int digits = 0;
            do {
                digits++;
                num /= 10;
            } while (num != 0);
            if (digits % 2 == 0) answer++;
        }
        return answer;
    }
}
