
class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> st = new Stack<>();
        int n = operations.length;

        for(int i = 0; i < n; i++){
            String s = operations[i];

            if(!s.equals("+") && !s.equals("D") && !s.equals("C")){
                st.push(Integer.parseInt(s));
            }
            else if(s.equals("+")){
                int b = st.pop();
                int a = st.pop();

                st.push(a);
                st.push(b);
                st.push(a + b);
            }
            else if(s.equals("D")){
                st.push(2 * st.peek());
            }
            else if(s.equals("C")){
                st.pop();
            }
        }

        int sum = 0;

        for(int x : st){
            sum += x;
        }

        return sum;
    }
}