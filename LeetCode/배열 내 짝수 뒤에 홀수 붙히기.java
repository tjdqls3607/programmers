class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] output = new int[nums.length];
        int outputIndex = 0;

        // 짝수 배열에 짝수 넣기
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                output[outputIndex++] = nums[i];  // 짝수는 output 배열에 넣기
            }
        }

        // 홀수 배열에 홀수 넣기
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                output[outputIndex++] = nums[i];  // 홀수는 output 배열에 넣기
            }
        }

        return output;  // 짝수와 홀수가 합쳐진 배열을 반환
    }
}
