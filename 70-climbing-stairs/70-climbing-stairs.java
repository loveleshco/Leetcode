class Solution {
    public int climbStairs(int n) {
        
        if(n < 4)
        {
            return n;
        }
        
        int[] res = new int[n+1];
        res[0] = 1;
        res[1] = 2;
        res[2] = 3;
        
        for(int i = 3; i <= n; i++)
        {
            res[i] = res[i-1] + res[i-2];
            System.out.println("n-2 number "+res[i-2] +" n-1 number is "+res[i-1]+" and number is "+res[i]);
        }
        
        return res[n-1];
        
        
    }
    
    
}