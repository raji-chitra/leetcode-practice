import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {

        // Step 1: Sort intervals based on start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Step 2: Store merged intervals
        List<int[]> ans = new ArrayList<>();

        // Step 3: Take the first interval as current
        int[] current = intervals[0];

        // Step 4: Traverse remaining intervals
        for (int i = 1; i < intervals.length; i++) {

            // Overlap exists
            if (intervals[i][0] <= current[1]) {

                // Extend the end if needed
                current[1] = Math.max(current[1], intervals[i][1]);

            } else {

                // No overlap, store current interval
                ans.add(current);

                // Make next interval as current
                current = intervals[i];
            }
        }

        // Step 5: Add the last interval
        ans.add(current);

        // Step 6: Convert List<int[]> to int[][]
        return ans.toArray(new int[ans.size()][]);
    }
}
