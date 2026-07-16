class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) return false;
        long r = 0,n=x;
        while (x != 0) {
            r = r * 10 + x % 10;
            x /= 10;
        }
    return ((r==n)?true:false);
    }
}
