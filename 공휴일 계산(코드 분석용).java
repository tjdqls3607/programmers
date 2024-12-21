import java.util.*;

class Solution {
    public int solution(int X, int[][] H) {
        int answer = 0;
        int fullDay = 365;          // 윤년 제외 1년 일수

        // 각 월의 일수를 정의 (평년 기준)
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // 공휴일 정보를 HashSet에 저장
        HashSet<Integer> holidaySet = new HashSet<>();
        for (int[] holiday : H) {
            // 월과 일을 1년 기준의 날짜로 변환
            int month = holiday[0];
            int day = holiday[1];
            int dayOfYear = 0;

            // 해당 월까지의 일수 합계 계산
            for (int m = 0; m < month - 1; m++) {
                dayOfYear += daysInMonth[m];
            }
            dayOfYear += (day - 1); // 해당 월의 특정 날짜를 추가
            holidaySet.add(dayOfYear);
        }

        // 1년(365일)을 순회하며 주말 및 공휴일 체크
        for (int i = 0; i < fullDay; i++) {
            int dayOfWeek = (X + i - 1) % 7 + 1; // 요일 계산 (1=월, 7=일)

            if (dayOfWeek == 6 || dayOfWeek == 7) { // 주말
                answer++;
            } else if (holidaySet.contains(i)) { // 주말이 아닌 공휴일
                answer++;
            }
        }
        return answer;
    }
}
