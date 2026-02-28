class Solution {
    public int hammingDistance(int x, int y) {
        // like if we count no of set bit in x^y that will be corrosponding different bits 

        int count1 =0 ;
        for(int i = 0; i < 32 ; i++ ){
            int xor = x ^ y ;
            if((xor & (1 << i)) != 0){
                count1++ ;
            }
        }

        return count1 ;
        
    }
}