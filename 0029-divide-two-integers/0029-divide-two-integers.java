class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        boolean negative = (dividend < 0) ^ (divisor < 0);

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int result = 0;

        for (int i = 31; i >= 0; i--) {

            if (a >= (b << i)) {  // jab tak subtract kar sakte hai jab tak a mai se b * 2^i ka result -ve na aa jai 
                a -= (b << i);
                result += (1 << i); // jitna bar subtraact hoga utna count kar lia 
            }
        }

        return negative ? -result : result;
    }
}
