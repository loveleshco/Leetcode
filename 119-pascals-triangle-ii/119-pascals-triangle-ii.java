class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        
        List<Integer> ll = new ArrayList<Integer>();
        ll.add(1);
        l.add(ll);
        
        for(int i = 1; i <= rowIndex; i++)
        {
            List<Integer> t = new ArrayList<Integer>();
            t.add(1);
            
           
            for(int j = 0; j < l.get(i-1).size() - 1; j++)
            {
                t.add(l.get(i-1).get(j) + l.get(i-1).get(j+1));
                System.out.println(t);
            }
            
            t.add(1);
            
            l.add(t);
            
        }
        
        return l.get(rowIndex);
    }
}
        
