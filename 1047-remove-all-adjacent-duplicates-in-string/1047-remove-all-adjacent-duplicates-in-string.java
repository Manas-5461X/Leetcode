class Solution {
    public String removeDuplicates(String s) {
      
      int n = s.length() ;
      String res = "" ;

      Stack<Character> st = new Stack<>();

      for(int i = 0 ; i < n ; i++ ){
        char ch = s.charAt(i) ;
        if(st.empty()){
            st.push(ch) ;
            continue ;
        }
        if(st.peek() == ch){ // we are checking most recent with ch if both are same remove from stack and string also
           st.pop() ;
           continue ;
        }
        st.push(ch);

      }

      while(!st.empty()){
        res += st.peek() ;
        st.pop() ;
      }
      return new StringBuilder(res).reverse().toString();
    }
}