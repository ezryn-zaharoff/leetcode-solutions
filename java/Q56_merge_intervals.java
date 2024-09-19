import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q56_merge_intervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> ans = new ArrayList<>();
        int[] prev = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];

            if (prev[1] >= interval[0]) {
                prev[1] = Math.max(prev[1], interval[1]);
            } else {
                ans.add(prev);
                prev = interval;
            }
        }

        ans.add(prev);

        return ans.toArray(new int[ans.size()][]); 
    }
}