import java.util.Arrays;

class Solution {
    public int[] moveZeroes(int[] nums) {
        int[] output = new int[nums.length];
        int outputIndex = 0;
        
        // 0이 아닌 값들은 output 배열에 채우기
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                output[outputIndex++] = nums[i];
            }
        }
        
        // 0을 뒤에 채우기
        for (int i = outputIndex; i < nums.length; i++) {
            output[i] = 0;
        }

        return output; // 0을 뒤로 옮긴 새로운 배열 반환
    }
}
