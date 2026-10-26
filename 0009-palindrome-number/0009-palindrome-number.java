class Solution {
    public boolean isPalindrome(int x) {
        int palindrome=x;
        int reverse=0;
        if(x<0){
            return false;
        }
        while(palindrome!=0){
            int remainder=palindrome%10;
            reverse=reverse*10+remainder;
            palindrome=palindrome/10;
        }
        if(x==reverse){
            return true;
        }
        return false;
    }
}