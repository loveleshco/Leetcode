class Solution {
    public int myAtoi(String s) {
        
        if(s.length() == 0)
        {
            return 0;
        }
        
        int len = s.length();
        int n = 0;
        int sign = 1;
        int res = 0;
        
        while(n < len && s.charAt(n) == ' ')
        {
            n++;
        }
        
        
        if(n < len && s.charAt(n)=='-')
        {
            sign = -1;
            n++;
        }
        else if(n < len &&s.charAt(n)=='+')
        {
            sign = 1;
            n++;
        }
        
        while(n < len && Character.isDigit(s.charAt(n)))
        {
            
            int digit = s.charAt(n) - '0';

            // Check overflow and underflow conditions. 
            if ((res > Integer.MAX_VALUE / 10) || 
                (res == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {     
                // If integer overflowed return 2^31-1, otherwise if underflowed return -2^31.    
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            
            res = res*10 + digit;
            n++;
        }
        
        return res*sign;
}
}