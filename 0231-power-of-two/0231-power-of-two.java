class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;     
// agr no 2 ki power ka ho toh then , msb pe 1 aayiga and bai pe zero and uska n-1 no pe msb pe zero aaiga baki sab pe 1 ya zero so unka 7 zero hi hoga ; 
//  10000  --4
// &00011  --3
//-------------
//  00000
    }
}