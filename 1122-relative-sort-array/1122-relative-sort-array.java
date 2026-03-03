class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        Arrays.sort(arr1);

        int n = arr1.length ; 
        int m = arr2.length ;
        int [] ans = new int[n];
        int idx = 0;
        boolean visited [] = new boolean[n] ;

        for(int i = 0 ; i < m ; i++){
            for(int j = 0; j < n ; j++){
                if(arr1[j] == arr2[i] && !visited[j]){
                    ans[idx] = arr1[j];
                     idx++;
                     visited[j] = true ;
                }
            }
        }

        for(int i = 0 ; i < n;i++){
            if (!visited[i]) {
                ans[idx] = arr1[i];
                idx++;
            }
        }
        return ans ;
    }
}