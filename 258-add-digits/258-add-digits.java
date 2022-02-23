class Solution {
    public int addDigits(int n) {
        
        while ( n >= 10)
        {
            int temp = n;
            List<Integer> l = new ArrayList();
            
            while(temp != 0)
            {
                l.add(temp%10);
                temp = temp / 10;
            }
            
            int sum = 0;
            
            for(int i = 0; i < l.size(); i++)
            {
                sum+=l.get(i);
            }
            
            n = sum;
        }
        
        return n;
    }
}