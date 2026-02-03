class Solution {
    public int removeElement(int[] nums, int val) {
        // my this approach is correct but according to question restriction Change the array nums such that the   first k elements of nums contain the elements which are not equal to val so this approach will not work 
        // for(int i = 0 ; i < nums.length ; i++){
        //     if(nums[i] == val){
        //         nums[i] = 0 ;
        //     }else{
        //         nums[i] = 1 ;
        //     }
        // }
        //  int sum = 0 ;
        // for(int i = 0 ; i < nums.length ; i++){
        //        sum += nums[i] ;
        // }

        // return sum ;


          int officer = 0;  

        for (int cm = 0; cm < nums.length; cm++) { 
            if (nums[cm] != val) {
                nums[officer] = nums[cm];
                officer++;
            }
        }
        return officer;
    }
}