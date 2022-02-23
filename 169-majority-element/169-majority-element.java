class Solution {
    public int majorityElement(int[] nums) {
        
        int majority = nums.length/2;
        
        Map<Integer, Integer> m = new HashMap();
        
        for(int i = 0; i < nums.length; i++)
        {
            if(m.containsKey(nums[i]))
            {
                m.put(nums[i], m.get(nums[i]) + 1);
            }
            else
            {
                m.put(nums[i], 1);
            }
        }
        
        for(Map.Entry<Integer, Integer> mp : m.entrySet())
        {
            if(mp.getValue() > majority)
            {
                return mp.getKey();
            }
        }
        
        return 1;
        
    }
}