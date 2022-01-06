class Solution {
    public String reverseWords(String s) {
        
        String[] res = s.split(" ");
        String result = "";
        
        for(int i = 0; i < res.length - 1; i++)
        {
            result+=reverse(res[i]) + " ";
            
        }
        return result + reverse(res[res.length-1]);
        
    }
    
    public String reverse(String str)
    {
        String reverse = "";
        
        for(int i = str.length()-1; i >= 0; i--)
        {
            reverse+= str.charAt(i);
        }
        
        return reverse;
    }
}