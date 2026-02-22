public class Solution {

    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if (n < 3) return false;

        int i = 0;

        while (i + 1 < n && arr[i] < arr[i + 1]) { //moving up 
            i++;
        }
        if (i == 0 || i == n - 1) return false; //peak cannot be first and last index 

        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == n - 1; //completed full moving up and down 
    }
}
