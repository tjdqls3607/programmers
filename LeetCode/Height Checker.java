import java.util.*;

class Solution {
    public int heightChecker(int[] heights) {
        int output = 0;
        int n = heights.length;
        int[] expect = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expect);
        
        for (int i=0; i<n; i++){
            if (heights[i] != expect[i]){
                output++;
            }
        }
        return output;
        
    }
}
