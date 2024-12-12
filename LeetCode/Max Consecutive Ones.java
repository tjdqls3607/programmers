class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;    // 최대 연속 1의 개수 저장
        int currentCount = 0; // 현재 연속된 1의 개수 추적
        
        for (int num : nums) {
            if (num == 1) {
                currentCount++;           // 1이면 개수 증가
                maxCount = Math.max(maxCount, currentCount); 
            } else {
                currentCount = 0;         // 0이면 개수 초기화
            }
        }
        return maxCount;
    }
}
