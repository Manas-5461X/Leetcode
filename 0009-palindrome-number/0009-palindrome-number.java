class Solution {
    public boolean isPalindrome(int x) {
        int origional = x; 
       int rev = 0;
 while (x > 0) {
    rev = rev * 10 + x % 10; 
    x /= 10;                 
}
  if(origional == rev)
    return true ; 
  else if (x < 0 )
    return false ; 
  else 
    return false ; 

    }
}