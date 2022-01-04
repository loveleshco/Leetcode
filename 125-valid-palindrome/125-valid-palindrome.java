class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.replaceAll(
          "[^a-zA-Z0-9]", "").toLowerCase();
        
        String reverse = "";
        
        for(int i = s.length() - 1; i >= 0; i--)
        {
            reverse+=s.charAt(i);
        }
        
        System.out.println(s+ "         "+reverse);
        
        return s.equals(reverse);
        
    }
}