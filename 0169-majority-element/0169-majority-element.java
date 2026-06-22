class Solution {
    public int majorityElement(int[] nums) {
       int c;
       int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            c=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    c++;
                }
            }
            if(c>n/2)
            {
                return nums[i];
            }


        }
        return 0;
        
    }
}