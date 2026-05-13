class Solution {
   private int sum(int[] a, int i, int j) {
      int sum = 0;
      for (int k = i; k <= j; k++) {
         sum += a[k];
      }

      return sum;
    }
    public int pivotIndex(int[] nums) {
        int n = nums.length ;
        for(int i = 0 ; i < n ; i++){
            if(sum(nums,0,i-1) == sum(nums,i+1,n-1)) return i ;
        }
        return -1 ;
    }
}