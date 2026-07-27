class Solution {
    public int balancedStringSplit(String s) {
        int count = 0, balance = 0;
        for (char c : s.toCharArray()) {
            balance += (c == 'R') ? 1 : -1;
            if (balance == 0) count++;
        }
        return count;
    }
}
