class Solution {
    public boolean isPalindrome(String s) {

        String fixed_string = "";

        for(char c : s.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c)){
                fixed_string += c;
            }
        }
        
        fixed_string = fixed_string.toLowerCase();

        int right = 0;
        int left = fixed_string.length()-1;

        while(right <= left){
            if(fixed_string.charAt(right) != fixed_string.charAt(left)){
            return false;
        }
        right ++ ;
        left -- ;
        }
    return true;
    }    
        
}