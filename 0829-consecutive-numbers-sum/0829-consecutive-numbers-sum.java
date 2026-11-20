class Solution {
    public int consecutiveNumbersSum(int n) {
        int count = 0; // to count valid sequences 

        // k is how many numbers we want in sequence like for 15 -> 15 - 1 number in seq || 7,8 - 2 numbers in seq etc 
        // starting with k = 1 that is trying with single number and also make sure smallest possible number through that sequence is not greater then that number, that is n * (n + 1)/2 < n 
        for (long k = 1; k * (k + 1) / 2 <= n; k++) {
            long rem = n - k * (k - 1) / 2; // repeacted subraction of numbers in sequence which give remainder like for 15 -> 15 - 1 - 2 - 3 - 4 - 5 = 0 remainder is 0 complted div   
            if (rem % k == 0) count++; // as remainder comes zero it is valid sequence so increase count 
        }
        return count;
    }
}