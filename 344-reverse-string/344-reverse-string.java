class Solution {
    public void reverseString(char[] s) {
        
        int start = 0;
        int end = s.length - 1;
        
       reverse(0,end,s);
        
        System.out.println(s);
        
    }
    
    public void reverse(int start,int end, char[] s) {
        
        if(start < end) {
            
            reverse(start + 1, end - 1, s);
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            
        }
        
    }
}