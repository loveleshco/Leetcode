class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        
        List<Integer> ll = new ArrayList<Integer>();
        ll.add(1);
        l.add(ll);
        
        for(int i = 1; i < numRows; i++)
        {
            List<Integer> t = new ArrayList<Integer>();
            t.add(1);
            
           
            for(int j = 0; j < l.get(i-1).size() - 1; j++)
            {
                t.add(l.get(i-1).get(j) + l.get(i-1).get(j+1));
                System.out.println(l.get(i-1));
            }
            
            t.add(1);
            
            l.add(t);
            
        }
        
        return l;
    }
}