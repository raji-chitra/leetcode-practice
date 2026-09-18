class Solution {
    public int maxProduct(int[] nums) {
       int maxproduct=nums[0];
       int minproduct=nums[0];
       int max=nums[0];
       for(int i=1;i<nums.length;i++)
       {
        int current=nums[i];
        int oldmax=maxproduct;
        int oldmin=minproduct;
        maxproduct=Math.max(current,Math.max(current*oldmax,current*oldmin));
        minproduct=Math.min(current,Math.min(current*oldmax,current*oldmin));
        max=Math.max(max,maxproduct);
       }
       return max;
    }
}