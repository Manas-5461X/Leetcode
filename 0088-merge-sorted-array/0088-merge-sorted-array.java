class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        //as here already nums1 has extra space then why should we create new array just use that space 

       for(int i =0; i < n; i++){
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}