class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end=0;
        int winsize=0;
        Set<Character>seen=new HashSet<>();
        while(end<s.length())
        {
            char c=s.charAt(end);
            while(seen.contains(c))
            {
                seen.remove(s.charAt(start));
                start++;
            }
            seen.add(c);
            winsize=Math.max(winsize,end-start+1);
            end++;
        }
        return winsize;
        
    }
}