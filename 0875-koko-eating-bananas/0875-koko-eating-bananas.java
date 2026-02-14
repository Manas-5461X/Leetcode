class Solution {

    private long fun(int[] piles, int k){
        long totalHours = 0;

        for(int i = 0; i < piles.length; i++){
            totalHours += (long)Math.ceil((double)piles[i] / k);
        }

        return  totalHours;
    }

    public int minEatingSpeed(int[] piles, int h) {
        
        int low = 1;
        int high = 0;

        for(int i = 0; i < piles.length; i++){
            high = Math.max(high, piles[i]);
        }

        int res = high;

        while(low <= high){
            int guess = low + (high - low)/2;

            long hours = fun(piles, guess);

            if(hours <= h){ //total hour less than guard hours 
                res = guess;
                high = guess - 1;
            }
            else{
                low = guess + 1;
            }
        }

        return res;
    }
}
