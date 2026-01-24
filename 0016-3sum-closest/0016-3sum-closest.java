class Solution {
    public int threeSumClosest(int[] nums, int target) {
         Arrays.sort(nums);
        int n = nums.length;
        int bsum = nums[0] + nums[1] +nums[2] ;

         for(int i = 0 ; i < n-2; i++){
            int left = i + 1; 
            int right = n - 1 ; 

            while(left < right){
                int csum = nums[i] + nums[right] + nums[left] ;

                if(Math.abs(csum - target) < Math.abs(bsum - target)) {
                    bsum = csum ;
                }

                if(csum == target){
                    return csum ;
                }else if(csum < target){
                    left++ ;                
                }else{
                    right-- ;
                }
            }
         }
         return bsum ;
    }
}