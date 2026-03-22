class Solution {

    private int[] pse(int[] A) {
        int n = A.length;
        Stack<Integer> st = new Stack<>();
        int[] pse = new int[n];

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && A[st.peek()] >= A[i]) {
                st.pop();
            }
            if (st.isEmpty())
                pse[i] = -1;
            else
                pse[i] = st.peek();

            st.push(i);
        }
        return pse;

    }

    private int[] nse(int[] A) {
        int n = A.length;
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[n];

        for (int i = n -1 ; i >= 0; i--) {
            while (!st.isEmpty() && A[st.peek()] >= A[i]) {
                st.pop();
            }
            if (st.isEmpty())
                nse[i] = n;
            else
                nse[i] = st.peek();

            st.push(i);
        }
        return nse;

    }

    public int largestRectangleArea(int[] heights) {
        int n = heights.length ;
        int[] pse = pse(heights) ;
        int[] nse = nse(heights) ;
        int maxArea = 0 ;
        for(int i = 0 ; i < n ; i++){
           int width = nse[i] - pse[i] - 1 ;
           int area = width * heights[i] ;
           maxArea = Math.max(maxArea,area);
        }
        return maxArea ;
    }
}