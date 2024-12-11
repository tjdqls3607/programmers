class Solution {
    public boolean isPalindrome(int x) {
        // 음수는 회문이 될 수 없으므로 바로 false 반환
        if (x < 0) {
            return false;
        }

        // 뒤집힌 숫자를 저장할 변수 초기화
        long reversed = 0;

        // 원래 숫자를 임시 변수에 저장
        long temp = x;
    
        // 숫자를 뒤집는 과정
        while (temp != 0) {
            // 현재 자리의 숫자를 추출
            int digit = (int) (temp % 10);
            
            // 뒤집힌 숫자를 한 자리 올리고 현재 자리 숫자를 추가
            reversed = reversed * 10 + digit;

            // 숫자를 오른쪽으로 한 자리 이동 (다음 자리로 이동)
            temp /= 10;
        }

        // 뒤집힌 숫자가 원래 숫자와 동일하면 회문
        return (reversed == x);
    }
}
