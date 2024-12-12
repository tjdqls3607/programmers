class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;  // 짝수 자릿수 개수 추적
        
        for (int num : nums) {
            if (hasEvenDigits(num)) {
                count++;
            }
        }
        return count;
    }
    
    // 숫자의 자릿수를 계산하고 짝수 여부 확인
    private boolean hasEvenDigits(int num) {
        int digitCount = 0;
        while (num > 0) {
            num /= 10;  // 자릿수 하나 제거
            digitCount++;
        }
        return digitCount % 2 == 0;  // 자릿수가 짝수인지 확인
    }
}
