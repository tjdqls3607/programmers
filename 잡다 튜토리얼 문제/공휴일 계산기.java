class Solution {
    public int solution(int X) {
        int answer = 0;
        int totalDays = 365;
        int firstDay = X;
        for (int i = 0; i < totalDays; i++) {
            int currentDay = (firstDay + i) % 7;  // 현재 요일 계산

            // 토요일(6) 또는 일요일(0)인지 확인
            if (currentDay == 0 || currentDay == 6) {
                answer++;
            }
        }
        return answer;
    }
}
