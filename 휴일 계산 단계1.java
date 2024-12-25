import java.util.*;

class Solution {
    // 메인 솔루션 클래스
    // 1월 1일의 요일(X)이 주어지면 1년 동안의 주말 개수를 계산합니다.
    public int solution(int X) {
        // HolidayCalculator 객체 생성 (1년 365일 기준, 시작 요일은 X)
        HolidayCalculator calculator = new HolidayCalculator(365, X);
        
        // 주말 계산 메서드를 호출하여 결과 반환
        return calculator.calculateWeekends();
    }
}

class HolidayCalculator {
    // 1년의 총 일수 (보통 365일, 윤년은 366일로 설정 가능)
    private final int fullDays;
    // 1월 1일의 시작 요일 (1: 월요일, 2: 화요일, ..., 7: 일요일)
    private final int startDay;

    /**
     * 생성자 (Constructor)
     * - HolidayCalculator 객체를 초기화합니다.
     * @param fullDays 1년의 총 일수 (예: 365)
     * @param startDay 1월 1일의 요일 (1: 월요일 ~ 7: 일요일)
     */
    public HolidayCalculator(int fullDays, int startDay) {
        this.fullDays = fullDays;
        this.startDay = startDay;
    }

    /**
     * 주말(토요일, 일요일) 개수를 계산하는 메서드
     * @return 주말의 총 개수
     */
    public int calculateWeekends() {
        int weekends = 0; // 주말 개수를 저장할 변수

        // 1년 동안 각 날짜에 대해 반복
        for (int i = 0; i < fullDays; i++) {
            // 현재 날짜의 요일 계산
            // (startDay + i - 1) % 7 + 1:
            // - startDay는 1월 1일의 요일
            // - i는 경과한 날짜 수
            // - -1은 배열과 같은 0-based index로 맞추기 위함
            // - %7은 7일 단위로 순환 (1~7)
            int dayOfWeek = (startDay + i - 1) % 7 + 1;

            // 만약 요일이 토요일(6) 또는 일요일(7)이라면 주말로 계산
            if (dayOfWeek == 6 || dayOfWeek == 7) {
                weekends++; // 주말 개수 증가
            }
        }

        // 계산된 주말 개수 반환
        return weekends;
    }
}
