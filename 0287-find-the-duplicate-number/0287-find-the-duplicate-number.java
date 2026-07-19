class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer>s=new HashSet<>();
        for(int k:nums)
        {
            if(!s.contains(k))
            {
                s.add(k);
            }
            else{
                return k;
            }

        }
        return 0;
        
    }
}