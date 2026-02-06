class Solution {
    public int minBitFlips(int start, int goal) {
        // solution  1 
        // return Integer.bitCount(start ^ goal);

        //solution 2
        // int x = start ^ goal;  
        // int count = 0;

        // while (x > 0) {
        //     count += x & 1;  
        //     x >>= 1;         
        // }

        // return count;

        //solution 3

        
        int count = 0;

        for (int i = 0; i < 32; i++) {

            int bitStart = start & (1 << i);
            int bitGoal  = goal  & (1 << i);

            if (bitStart != bitGoal) {
                count++;
            }
        }

        return count;
    }
}
