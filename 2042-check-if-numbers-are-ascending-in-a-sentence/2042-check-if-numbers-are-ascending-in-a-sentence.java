class Solution {
    public boolean areNumbersAscending(String s) {
        
        
        int temp = 0;
        
        for(int i = 0; i < s.length(); i++)
        {
            int number = 0;
            if(Character.isDigit(s.charAt(i)))
            {
                while(i < s.length() && Character.isDigit(s.charAt(i)))
                {
                    number = number*10 + Character.getNumericValue(s.charAt(i));
                    i++;
                }
                
                System.out.println(number + " Current Index i is "+i );
                
                if(number > temp)
                {
                    temp = number;
                }
                else
                {
                    return false;
                }
                
            }
        }
        
        return true;
        
    }
}