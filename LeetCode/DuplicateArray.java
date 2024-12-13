class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 ) return 0;
        int output = 1;
        
        for (int i=1; i<nums.length; i++) {
            if (nums[i] != nums[output-1]){
                nums[output] = nums[i];
                output++;
            }
        }
        return output;
    }
}
