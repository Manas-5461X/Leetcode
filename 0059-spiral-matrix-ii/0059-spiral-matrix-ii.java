class Solution {
    public int[][] generateMatrix(int n) {

        int top = 0;
        int bottom = n - 1;

        int left = 0;
        int right = n - 1;

        int num = 1 ;

        int nums[][] = new int[n][n] ;

        while (top <= bottom && left <= right) {

            // l - r
            for (int i = left; i <= right; i++) {
                nums[top][i] = num++ ;
            }
            top++;
            
            // t - b
            for (int i = top; i <= bottom; i++) {
                 nums[i][right] = num++ ;
            }
            right--;

            // r - l
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                     nums[bottom][i] = num++ ;
                }
                bottom--;
            }

            // b - t
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    nums[i][left] = num++ ;
                }
                left++;
            }
        }

        return nums;
        
    }
}