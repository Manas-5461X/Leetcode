class Solution {
    public int uniquePaths(int m, int n) {
        int k = m + n - 2; 
        int r = Math.min(m,n) - 1 ;
        long res = 1 ;
        for (int i = 1; i <= r; i++) {
            res = res * (k - r + i) / i;   // that mathematical shorcut that we use to calculate nCr 
        }
        return (int) res;
    }
}