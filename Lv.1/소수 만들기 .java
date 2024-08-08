class Solution {
    public int solution(int[] nums) {
        int count = 0; //소수의 갯수
        int sum = 0; // 숫자3개의 합
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                for (int k=j+1; k<nums.length; k++){
                    sum = nums[i] + nums[j] + nums[k];
                    if (isPrime(sum)) 
                        count += 1;
                }
            }
        }
        return count;
    }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        private boolean isPrime(int sum) {
            if(sum == 2) return true;
            
            for (int i=2; i<=Math.sqrt(sum); i++) {
                if(sum % i == 0){
                    return false;
                }
                
            }
            return true;
    }
}
